package com.epam.Logging_Exception;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Estimate_costTest extends TestCase {

	public void testEstimation() {
		Assert.assertEquals(360000,Estimate_cost.estimation("high standard",200,"no"),0);
		Assert.assertEquals(500000,Estimate_cost.estimation("high standard",200,"yes"),0);
		Assert.assertEquals(600000,Estimate_cost.estimation("standard",500,"no"),0);
		Assert.assertEquals(450000,Estimate_cost.estimation("above standard",300,"no"),0);
	}

}
