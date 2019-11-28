/*
 * generated by Xtext 2.19.0
 */
package de.dc.sql.lang.parser.antlr;

import com.google.inject.Inject;
import de.dc.sql.lang.parser.antlr.internal.InternalSqlQueryDslParser;
import de.dc.sql.lang.services.SqlQueryDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SqlQueryDslParser extends AbstractAntlrParser {

	@Inject
	private SqlQueryDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSqlQueryDslParser createParser(XtextTokenStream stream) {
		return new InternalSqlQueryDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public SqlQueryDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SqlQueryDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
