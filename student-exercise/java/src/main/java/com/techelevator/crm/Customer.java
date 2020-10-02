package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techelevator.Person;

public class Customer extends Person implements Billable {
	
	private String phoneNumber;
	private List<Pet> pet = new ArrayList<>();
	

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public List<Pet> getPet() {
		return pet;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setPet(List<Pet> pet) {
		this.pet = pet;
	}

	public Customer(String firstName, String lastName, String phoneNumber) {
		super(firstName, lastName);
		this.phoneNumber = phoneNumber;
	}
	
	public Customer(String firstName, String lastName) {
		super(firstName, lastName);
		phoneNumber = "";
	}
	

	
	public double getBalanceDue(Map<String, Double> servicesRendered) {
		double total = 0;
		Set<String> service = servicesRendered.keySet();
		for(String services : service) {
			
				total += servicesRendered.get(services);
				
		}		
				return total;
	}

	}
	
	

