package javaReactDay4Hw1;

import java.util.Date;

public class Customer implements Entity{
	int id;
	String firstName;
	String lastName;
	Date dateOfBirthday;
	String nationalityId;
	
	public Customer() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirthday() {
		return dateOfBirthday;
	}
	public void setDateOfBirthday(Date dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	

}
