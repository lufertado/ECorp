package com.ecorp.creditcardcalc.counter;

import org.springframework.stereotype.Component;

@Component
public class CreditCardCounter {

	/**
	 * Counts the number of false credit cards created 
	 * in a number of days given
	 * @param numOfDays Number of days
	 * @return Count false credit cards created
	 */
	public int count(int numOfDays) {
		int count = numOfDays;
		for(int i = 1; i <= numOfDays; i++) {
			count *= i;
		}
		return count;
	}

}
