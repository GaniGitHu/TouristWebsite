package com.TouristWebsite.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="Userlist")
public class Tourist {
	@Id
	private int Id;
	private String FirstName;
	private String LastName;
	private String Gender;
	private int Age;
	private String  FromPlace;
	private int NumberOfDays;																																																																	
	
	public Tourist() {
		super();
	}
	
	
	public Tourist(int id, String firstName, String lastName, String gender, int age, String fromPlace,
			int numberOfDays) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
		Age = age;
		FromPlace = fromPlace;
		NumberOfDays = numberOfDays;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getFromPlace() {
		return FromPlace;
	}


	public void setFromPlace(String fromPlace) {
		FromPlace = fromPlace;
	}


	public int getNumberOfDays() {
		return NumberOfDays;
	}


	public void setNumberOfDays(int numberOfDays) {
		NumberOfDays = numberOfDays;
	}
	
	
	
	

}
