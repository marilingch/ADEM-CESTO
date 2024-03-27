package org.tmview.interfaces;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static ResourceBundle RESOURCE_BUNDLE = null;

	public static void initMessages() throws MalformedURLException {
		// the resource bundle is obtained from the "resources" folder by 
		// creating a new class loader
		File file = new File("resources"); //$NON-NLS-1$
		URL[] urls = {file.toURI().toURL()};
		ClassLoader resourcesClassLoader = new URLClassLoader(urls);

		// create resource bundle to read "paramInterfaceLanguage" from configuration.properties 
		ResourceBundle configurationRB;
		configurationRB = ResourceBundle.getBundle("configuration", Locale.getDefault(), resourcesClassLoader); //$NON-NLS-1$
		String paramInterfaceLanguage = configurationRB.getString("paramInterfaceLanguage"); //$NON-NLS-1$

		// split the interface language using "_"
		String[] localeComponents = paramInterfaceLanguage.split("_"); //$NON-NLS-1$

		// create the locale based on the components used
		Locale locale = null;
		if (localeComponents.length == 3) {
			locale = new Locale(localeComponents[0], localeComponents[1], localeComponents[2]);	
		} else if (localeComponents.length == 2) {
			locale = new Locale(localeComponents[0], localeComponents[1]);	
		} else {
			locale = new Locale(localeComponents[0]);	
		}
		
		// create the "messages" resource bundle 
		RESOURCE_BUNDLE = ResourceBundle.getBundle("messages", locale, resourcesClassLoader); //$NON-NLS-1$
	}

	private Messages() {
	}

	public static String getString(String key) {

		// dynamically build RESOURCE_BUNDLE if required
		if (Messages.RESOURCE_BUNDLE == null) {
			try {
				initMessages();
			} catch (MalformedURLException e) {
				RESOURCE_BUNDLE = ResourceBundle.getBundle("messages"); //$NON-NLS-1$
			}
		}

		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
