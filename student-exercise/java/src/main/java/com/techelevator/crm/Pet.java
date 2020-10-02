package com.techelevator.crm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pet {
	
	private String name;
	private String species;
	private List<String> vaccinations;

	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}
	public List<String> getVaccinations() {
		return vaccinations;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public void setVaccinations(List<String> vaccinations) {
		this.vaccinations = vaccinations;
	}
	
	public Pet(String name, String species) {
		this.name = name;
		this.species = species;
		vaccinations = new ArrayList<String>();
	}
	
	public String listVaccinations() {
		String output = "";
		
		
		for(int i = 0; i<vaccinations.size(); i++) {
			output += vaccinations.get(i);
			if(i != vaccinations.size()-1) {
				output += ", ";
			}
		
		}
			return output;
	}
	
}
