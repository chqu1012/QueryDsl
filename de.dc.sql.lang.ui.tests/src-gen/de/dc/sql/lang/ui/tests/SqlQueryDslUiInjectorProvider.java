/*
 * generated by Xtext 2.19.0
 */
package de.dc.sql.lang.ui.tests;

import com.google.inject.Injector;
import de.dc.sql.lang.ui.internal.LangActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class SqlQueryDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LangActivator.getInstance().getInjector("de.dc.sql.lang.SqlQueryDsl");
	}

}
