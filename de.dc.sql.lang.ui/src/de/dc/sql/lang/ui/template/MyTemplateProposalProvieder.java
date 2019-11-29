package de.dc.sql.lang.ui.template;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.google.inject.Inject;

public class MyTemplateProposalProvieder extends DefaultTemplateProposalProvider {

	private TemplateContext templateContext;
	private ContentAssistContext context;
	private ITemplateAcceptor acceptor;
	
	@Inject
	public MyTemplateProposalProvieder(TemplateStore templateStore, ContextTypeRegistry registry,
			ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}

	@Override
	protected void createTemplates(TemplateContext templateContext, ContentAssistContext context,
			ITemplateAcceptor acceptor) {
		// "regular templates"
		super.createTemplates(templateContext, context, acceptor);
		this.templateContext = templateContext;
		this.context = context;
		this.acceptor = acceptor;
		
		createTemplate("base query template", "create new base query with template", "baseTemplate", "Query ${name}()```\n${statement}\n```");
		createTemplate("select all query template", "create new select all query with template", "selectAllTemplate", "Query ${findAll}()```\nSELECT * FROM ${table}\n```");
		createTemplate("select all by query template", "create new select all by query with template", "selectAllByTemplate", "Query ${findAllBy}(String ${name})```\nSELECT * FROM ${table}\nWHERE ${name}='<${name}>'\n```");
	}

	private void createTemplate(String name, String description, String id, String tpl) {
		// create a template on the fly
		Template template = new Template(name, description, id, tpl, false);// auto-insertable?

		// create a proposal
		TemplateProposal tp = createProposal(template, templateContext, context, getImage(template),
				getRelevance(template));

		// make it available
		acceptor.accept(tp);
	}
}