package testcase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class yest {
     static Logger logger=Logger.getLogger(yest.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
     logger.debug("this is debug");
     logger.info("this is info");
     logger.warn("this is info");

	}

}
