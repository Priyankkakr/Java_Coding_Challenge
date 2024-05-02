package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.model.Applicants;
import com.model.Companies;
import com.model.JobApplications;
import com.model.JobListings;
import com.service.ApplicantsService;
import com.service.CompaniesService;
import com.service.JobApplicationsService;
import com.service.JobListingsService;

public class CarrierHubController {


	public static <case5Dto> void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JobApplicationsService jobApplicationsService = new JobApplicationsService();
		JobListingsService jobListingsService = new JobListingsService();
		ApplicantsService applicantsService = new ApplicantsService();
		CompaniesService companiesService = new CompaniesService();
		while(true) {
			System.out.println("1. Apply for the job");
			System.out.println("2. Retrieves list of applicants");
			System.out.println("3. Post a new Job");
			System.out.println("4. Posted Jobs based on companyId");
			System.out.println("5. Profile Creation by applicants");
			System.out.println("6. Retrieve a list of all companies");
			System.out.println("7. Retrieve list of jobs");
			System.out.println("0. Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exited successfully");
				break;
				}
			switch(input) {
			case 1:
				try {
					JobApplications jobApplications = new JobApplications(); 
					Random r1 = new Random(); 
					int rN1 = r1.nextInt(); 
					int application_id =rN1<0?rN1*-1:rN1;
					jobApplications.setApplicationId(application_id);
					System.out.println(application_id);
					System.out.println("Enter the applicant id");
					jobApplications.setApplicantID(sc.nextInt());
					System.out.println("Enter the JobId");
					jobApplications.setJobId(sc.nextInt());
					sc.nextLine();
					System.out.println("Enter the Application date");
					jobApplications.setApplicaionDate(sc.next());
					System.out.println("Enter Cover Letter");
					jobApplications.setCoverLetter(sc.next());
					jobApplicationsService.save(jobApplications);
					System.out.println("Applied successfully!");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 2:
				
				try {
					List<Applicants> listapp = applicantsService.findAll();
					for (Applicants app : listapp) {
						System.out.println(app);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 3:
				
			    try {
			    	JobListings jobListings = new JobListings();
					Random r2 = new Random(); 
					int rN2 = r2.nextInt(); 
					int jobid =rN2<0?rN2*-1:rN2;
					jobListings.setJobID(jobid);
					System.out.println("Enter the Company Id");
					jobListings.setCompanyID(sc.nextInt());
					sc.nextLine();
					System.out.println("Enter the Job Title");
					jobListings.setJobTitle(sc.nextLine());
					System.out.println("Enter the Job Description");
					jobListings.setJobDescription(sc.nextLine());
					System.out.println("Enter the Job Location");
					jobListings.setJobDescription(sc.nextLine());
					System.out.println("Enter the Salary");
					jobListings.setSalary(sc.nextDouble());
					sc.nextLine();
					System.out.println("Enter the Job Type");
					jobListings.setJobType(sc.nextLine());
				    System.out.println("Enter the Post date");
				    jobListings.setPostedDate(sc.next());
					jobListingsService.save(jobListings);
					System.out.println("Job Added");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 4:
				System.out.println("Enter the company ID");
				int comId = sc.nextInt();
				try {
					List<JobListings> joblist = jobListingsService.findAll();
					for(JobListings j : joblist) {
						System.out.println(j);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			case 5:
				try {
					Applicants a = new Applicants();
					Random r3 = new Random(); 
					int rN3 = r3.nextInt(); 
					int applicant_id =rN3<0?rN3*-1:rN3;
					a.setApplicantId(applicant_id);
					sc.nextLine();
					System.out.println("Enter Your First name");
					a.setFirstName(sc.nextLine());
					System.out.println("Enter Your Last Name");
					a.setLastName(sc.nextLine());
					System.out.println("Enter Your Email");
					a.setEmail(sc.nextLine());
					System.out.println("Enter Your Phone Number");
					a.setPhone(sc.nextLine());
					System.out.println("Give Your Resume");
					a.setResume(sc.nextLine());
					applicantsService.save(a);
					System.out.println("Profile was created succesfully");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				//applicants to apply for a specific job id
			case 6:
				
				try {
					List<Companies> company = companiesService.findAll();
					for(Companies c:company) {
						System.out.println(c);
				}} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 7:
				
				try {
					List<JobListings> jobList = jobListingsService.findAll();
					for (JobListings listing : jobList) {
		                 System.out.println(listing);
		             }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	             
			}

	}
		sc.close();

	}
}
