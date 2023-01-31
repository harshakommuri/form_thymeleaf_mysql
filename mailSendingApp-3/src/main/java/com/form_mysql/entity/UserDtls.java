package com.form_mysql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DTLS")
public class UserDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String DOB;
	private String gender;
	private String location;
	private int experience;
	private String skills;
	private long phone;
	private String email;
	private String pocName;
	private String pocEmail;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPocName() {
		return pocName;
	}
	public void setPocName(String pocName) {
		this.pocName = pocName;
	}
	public String getPocEmail() {
		return pocEmail;
	}
	public void setPocEmail(String pocEmail) {
		this.pocEmail = pocEmail;
	}
	@Override
	public String toString() {
		return "UserDtls [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB
				+ ", gender=" + gender + ", location=" + location + ", experience=" + experience + ", skills=" + skills
				+ ", phone=" + phone + ", email=" + email + ", pocName=" + pocName + ", pocEmail=" + pocEmail + "]";
	}
	
	
	
	
}
