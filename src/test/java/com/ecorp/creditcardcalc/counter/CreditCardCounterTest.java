package com.ecorp.creditcardcalc.counter;


import org.junit.Assert;
import org.junit.Test;


public class CreditCardCounterTest {

	@Test
	public void countTest() {
		CreditCardCounter counter = new CreditCardCounter();
		Assert.assertEquals(1, counter.count(1));
		Assert.assertEquals(4, counter.count(2));
		Assert.assertEquals(18, counter.count(3));
		Assert.assertEquals(96, counter.count(4));
		Assert.assertEquals(600, counter.count(5));
		Assert.assertEquals(4320, counter.count(6));
	}
}
