/**
 */
package de.dc.sql.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.sql.model.Application#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see de.dc.sql.model.SqlQueryPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.sql.model.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see de.dc.sql.model.SqlQueryPackage#getApplication_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQueries();

} // Application
