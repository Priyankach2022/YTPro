package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture 
{
public static void takelogs(String classname, String message)
{
	DOMConfigurator.configure("../YTFramework/layout.xml");
    Logger log=Logger.getLogger(classname);
    log.info(message);
}
}
