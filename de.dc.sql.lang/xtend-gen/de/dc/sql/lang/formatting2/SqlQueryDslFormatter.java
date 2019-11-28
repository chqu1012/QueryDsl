/**
 * generated by Xtext 2.19.0
 */
package de.dc.sql.lang.formatting2;

import com.google.inject.Inject;
import de.dc.sql.lang.services.SqlQueryDslGrammarAccess;
import de.dc.sql.lang.sqlQueryDsl.Model;
import de.dc.sql.lang.sqlQueryDsl.Query;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.formatting2.XbaseFormatter;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;

@SuppressWarnings("all")
public class SqlQueryDslFormatter extends XbaseFormatter {
  @Inject
  @Extension
  private SqlQueryDslGrammarAccess _sqlQueryDslGrammarAccess;
  
  protected void _format(final Model application, @Extension final IFormattableDocument document) {
    EList<Query> _queries = application.getQueries();
    for (final Query query : _queries) {
      document.<Query>format(query);
    }
  }
  
  protected void _format(final Query query, @Extension final IFormattableDocument document) {
    EList<JvmFormalParameter> _parameters = query.getParameters();
    for (final JvmFormalParameter parameter : _parameters) {
      document.<JvmFormalParameter>format(parameter);
    }
  }
  
  public void format(final Object application, final IFormattableDocument document) {
    if (application instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)application, document);
      return;
    } else if (application instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)application, document);
      return;
    } else if (application instanceof XtextResource) {
      _format((XtextResource)application, document);
      return;
    } else if (application instanceof XAssignment) {
      _format((XAssignment)application, document);
      return;
    } else if (application instanceof XBinaryOperation) {
      _format((XBinaryOperation)application, document);
      return;
    } else if (application instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)application, document);
      return;
    } else if (application instanceof XFeatureCall) {
      _format((XFeatureCall)application, document);
      return;
    } else if (application instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)application, document);
      return;
    } else if (application instanceof XPostfixOperation) {
      _format((XPostfixOperation)application, document);
      return;
    } else if (application instanceof XWhileExpression) {
      _format((XWhileExpression)application, document);
      return;
    } else if (application instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)application, document);
      return;
    } else if (application instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)application, document);
      return;
    } else if (application instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)application, document);
      return;
    } else if (application instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)application, document);
      return;
    } else if (application instanceof XBasicForLoopExpression) {
      _format((XBasicForLoopExpression)application, document);
      return;
    } else if (application instanceof XBlockExpression) {
      _format((XBlockExpression)application, document);
      return;
    } else if (application instanceof XCastedExpression) {
      _format((XCastedExpression)application, document);
      return;
    } else if (application instanceof XClosure) {
      _format((XClosure)application, document);
      return;
    } else if (application instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)application, document);
      return;
    } else if (application instanceof XConstructorCall) {
      _format((XConstructorCall)application, document);
      return;
    } else if (application instanceof XForLoopExpression) {
      _format((XForLoopExpression)application, document);
      return;
    } else if (application instanceof XIfExpression) {
      _format((XIfExpression)application, document);
      return;
    } else if (application instanceof XInstanceOfExpression) {
      _format((XInstanceOfExpression)application, document);
      return;
    } else if (application instanceof XReturnExpression) {
      _format((XReturnExpression)application, document);
      return;
    } else if (application instanceof XSwitchExpression) {
      _format((XSwitchExpression)application, document);
      return;
    } else if (application instanceof XSynchronizedExpression) {
      _format((XSynchronizedExpression)application, document);
      return;
    } else if (application instanceof XThrowExpression) {
      _format((XThrowExpression)application, document);
      return;
    } else if (application instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)application, document);
      return;
    } else if (application instanceof XTypeLiteral) {
      _format((XTypeLiteral)application, document);
      return;
    } else if (application instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)application, document);
      return;
    } else if (application instanceof Model) {
      _format((Model)application, document);
      return;
    } else if (application instanceof Query) {
      _format((Query)application, document);
      return;
    } else if (application instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)application, document);
      return;
    } else if (application instanceof XExpression) {
      _format((XExpression)application, document);
      return;
    } else if (application instanceof XImportDeclaration) {
      _format((XImportDeclaration)application, document);
      return;
    } else if (application instanceof XImportSection) {
      _format((XImportSection)application, document);
      return;
    } else if (application instanceof EObject) {
      _format((EObject)application, document);
      return;
    } else if (application == null) {
      _format((Void)null, document);
      return;
    } else if (application != null) {
      _format(application, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(application, document).toString());
    }
  }
}
