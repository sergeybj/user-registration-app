package org.sergey.javabrains.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="user_id_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pk_sequence")
	@Column(name="USER_ID")
	private Long userId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="BIRTH_DATE")
	private Date birthDate;
	@Column(name="CONFIRM_EMAIL_SENT")
	private Boolean confirmationEmailSent;
	@Column(name="USER_CONFIRMED")
	private Boolean userConfirmed;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", birthDate=" + birthDate
				+ ", confirmationEmailSent=" + confirmationEmailSent
				+ ", userConfirmed=" + userConfirmed + "]";
	}



	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Boolean getConfirmationEmailSent() {
		return confirmationEmailSent;
	}
	public void setConfirmationEmailSent(Boolean confirmationEmailSent) {
		this.confirmationEmailSent = confirmationEmailSent;
	}
	public Boolean getUserConfirmed() {
		return userConfirmed;
	}
	public void setUserConfirmed(Boolean userConfirmed) {
		this.userConfirmed = userConfirmed;
	}
	
	
	
	

}
