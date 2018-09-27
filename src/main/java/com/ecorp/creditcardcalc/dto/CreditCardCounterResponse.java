package com.ecorp.creditcardcalc.dto;

public class CreditCardCounterResponse {

	private int creditCardCount;

	public CreditCardCounterResponse(int creditCardCount) {
		super();
		this.creditCardCount = creditCardCount;
	}
	
	public int getCreditCardCount() {
		return creditCardCount;
	}
}
