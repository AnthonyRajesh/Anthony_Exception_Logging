package com.epam.Logging_Exception;

import org.apache.logging.log4j.LogManager;
public class Compound_interest {
	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(Estimate_cost.class);
	public static double compound_Interest(double amount,double rate,double time)
	{
		LOGGER.info(amount*Math.pow((1+rate/100.0),time)-amount);
		LOGGER.error("An Error Occurred");
		LOGGER.warn("Code is Wrong");
		LOGGER.fatal("Case Aborted");
		return amount*Math.pow((1+rate/100.0),time)-amount;
	}
}
