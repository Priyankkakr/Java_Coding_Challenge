package com.dto;

public class Case5Dto {
	private int ApplicantId;
	private String FirstName;
	private String LastName;
	private int JobID;
	private String JobTitle;
	public int getApplicantId() {
		return ApplicantId;
	}
	public void setApplicantId(int applicantId) {
		ApplicantId = applicantId;
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
	public int getJobID() {
		return JobID;
	}
	public void setJobID(int jobID) {
		JobID = jobID;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public Case5Dto(int applicantId, String firstName, String lastName, int jobID, String jobTitle) {
		super();
		ApplicantId = applicantId;
		FirstName = firstName;
		LastName = lastName;
		JobID = jobID;
		JobTitle = jobTitle;
	}
	public Case5Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Case5Dto [ApplicantId=" + ApplicantId + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", JobID=" + JobID + ", JobTitle=" + JobTitle + "]";
	}
	

}
