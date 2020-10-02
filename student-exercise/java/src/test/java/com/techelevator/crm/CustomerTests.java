package com.techelevator.crm;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;



public class CustomerTests {

	 @Test
	    public void getBalanceDue() {
	        Customer customer = new Customer("Test", "Testerson");
	        Map<String, Double> testServices = new HashMap<>();
	        testServices.put("Walking", 10.00);
	        testServices.put("Grooming", 20.00);
	        
	        assertEquals("Returned the wrong balance.", 30, customer.getBalanceDue(testServices), 0.0);
	        
	    }
}
