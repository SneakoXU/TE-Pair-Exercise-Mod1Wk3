package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import com.techelevator.Billable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class PetTests {
	
	@Test
	public void vaccination_list_as_string() {
		Pet pet = new Pet("Sparky", "Dog");
		List<String> vaccination = new ArrayList<String>();
		vaccination.add("Rabies");
		vaccination.add("Distemper");
		vaccination.add("Parvo");
		
		//Assert.assertEquals("Rabies Distemper Parvo", "Rabies, Distemper, Parvo", pet.listVaccinations());
		
		Assert.assertEquals("Rabies, Distemper, Parvo", pet.listVaccinations());
		
		
	}
	

}
