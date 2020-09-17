package com.bmsjava.model;

import java.util.Date;

public class UserDTO {
	private long id;	
	private String fullname;
	private String username;
	private String password;
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
	private String idDocNo;
	private String acHolderName;
	private String acHolderAccNo;
	private String acHolderAddr;
	private String accountNumber;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	
	public String getIdDocNo() {
		return idDocNo;
	}
	public void setIdDocNo(String idDocNo) {
		this.idDocNo = idDocNo;
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
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", fullname=" + fullname + ", username=" + username + ", password=" + password
				+ ", guardianType=" + guardianType + ", guardianName=" + guardianName + ", address=" + address
				+ ", citizenship=" + citizenship + ", state=" + state + ", country=" + country + ", emailAddress="
				+ emailAddress + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", contactNo=" + contactNo
				+ ", dob=" + dob + ", registrationDate=" + registrationDate + ", accountType=" + accountType
				+ ", branchName=" + branchName + ", citizenStatus=" + citizenStatus + ", amount=" + amount
				+ ", idProofType=" + idProofType + ", idDocNo=" + idDocNo + ", acHolderName=" + acHolderName
				+ ", acHolderAccNo=" + acHolderAccNo + ", acHolderAddr=" + acHolderAddr + ", accountNumber="
				+ accountNumber + "]";
	}
	
	
}