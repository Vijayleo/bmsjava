package com.bmsjava.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	@JsonIgnore
	private String password;
	private String name;
	private String guardianType;
	private String guardianName;
	private String address;
	private String citizenship;
	private String state;
	private String country;
	private String emailAddress;
	private String gender;
	private String maritalStatus;
	private long contactNo;
	private Date dob;
	private Date registrationDate;
	private String accountType;
	private String branchName;
	private String citizenStatus;
	private long amount;
	private String idProofType;
	private String idDocType;
	private String acHolderName;
	private String acHolderAccNo;
	private String acHolderAddr;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGuardianType() {
		return guardianType;
	}
	public void setGuardianType(String guardianType) {
		this.guardianType = guardianType;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getCitizenStatus() {
		return citizenStatus;
	}
	public void setCitizenStatus(String citizenStatus) {
		this.citizenStatus = citizenStatus;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getIdProofType() {
		return idProofType;
	}
	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}
	public String getIdDocType() {
		return idDocType;
	}
	public void setIdDocType(String idDocType) {
		this.idDocType = idDocType;
	}
	public String getAcHolderName() {
		return acHolderName;
	}
	public void setAcHolderName(String acHolderName) {
		this.acHolderName = acHolderName;
	}
	public String getAcHolderAccNo() {
		return acHolderAccNo;
	}
	public void setAcHolderAccNo(String acHolderAccNo) {
		this.acHolderAccNo = acHolderAccNo;
	}
	public String getAcHolderAddr() {
		return acHolderAddr;
	}
	public void setAcHolderAddr(String acHolderAddr) {
		this.acHolderAddr = acHolderAddr;
	}
	@Override
	public String toString() {
		return "DAOUser [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", guardianType=" + guardianType + ", guardianName=" + guardianName + ", address=" + address
				+ ", citizenship=" + citizenship + ", state=" + state + ", country=" + country + ", emailAddress="
				+ emailAddress + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", contactNo=" + contactNo
				+ ", dob=" + dob + ", registrationDate=" + registrationDate + ", accountType=" + accountType
				+ ", branchName=" + branchName + ", citizenStatus=" + citizenStatus + ", amount=" + amount
				+ ", idProofType=" + idProofType + ", idDocType=" + idDocType + ", acHolderName=" + acHolderName
				+ ", acHolderAccNo=" + acHolderAccNo + ", acHolderAddr=" + acHolderAddr + "]";
	}

}