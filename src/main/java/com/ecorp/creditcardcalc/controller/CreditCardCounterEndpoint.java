package com.ecorp.creditcardcalc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecorp.creditcardcalc.counter.CreditCardCounter;
import com.ecorp.creditcardcalc.dto.CreditCardCounterResponse;

/**
 * Service that determines how many false credit cards
 * will be created by an attacker in a number of days given
 *
 */
@RestController
public class CreditCardCounterEndpoint {

	@Autowired
	CreditCardCounter creditCardCounter;
	
    public CreditCardCounterEndpoint(CreditCardCounter creditCardCounter) {
		super();
		this.creditCardCounter = creditCardCounter;
	}

    /**
     * Determines how many false credit cards will be created
     * in a number of days given (6 by default)
     * @param numOfDays. Number of days. Optional. 6 by default
     * @return Response with count of credit cards
     */
	@RequestMapping(method = RequestMethod.GET, path = "/creditcard/counter")
    public CreditCardCounterResponse falseCreditCardCounter(@RequestParam(defaultValue = "6") int numOfDays) {
        return new CreditCardCounterResponse(creditCardCounter.count(numOfDays));
    }

}
