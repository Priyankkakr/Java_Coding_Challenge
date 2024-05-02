package com.model;

public class JobListings {
	private int JobID;
    private int CompanyID;
    private String JobTitle ;
    private String JobDescription;
    private String Joblocation;
    private double Salary;
    private String JobType;
    private String PostedDate;
    public int getJobID() {
		return JobID;
	}
	public void setJobID(int jobID) {
		JobID = jobID;
	}
	public int getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(int companyID) {
		CompanyID = companyID;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getJobDescription() {
		return JobDescription;
	}
	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}
	public String getJoblocation() {
		return Joblocation;
	}
	public void setJoblocation(String joblocation) {
		Joblocation = joblocation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getJobType() {
		return JobType;
	}
	public void setJobType(String jobType) {
		JobType = jobType;
	}
	public String getPostedDate() {
		return PostedDate;
	}
	public void setPostedDate(String postedDate) {
		PostedDate = postedDate;
	}
	public JobListings(int jobID, int companyID, String jobTitle, String jobDescription, String joblocation,
			double salary, String jobType, String postedDate) {
		super();
		JobID = jobID;
		CompanyID = companyID;
		JobTitle = jobTitle;
		JobDescription = jobDescription;
		Joblocation = joblocation;
		Salary = salary;
		JobType = jobType;
		PostedDate = postedDate;
	}
	public JobListings() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "JobListings [JobID=" + JobID + ", CompanyID=" + CompanyID + ", JobTitle=" + JobTitle
				+ ", JobDescription=" + JobDescription + ", Joblocation=" + Joblocation + ", Salary=" + Salary
				+ ", JobType=" + JobType + ", PostedDate=" + PostedDate + "]";
	}
	

}
