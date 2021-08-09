package com.calibt.Utilll;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogsHelpper_Logg {

	private static boolean root = false;

	public static Logger getLogss(Class cls) {
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}

}
