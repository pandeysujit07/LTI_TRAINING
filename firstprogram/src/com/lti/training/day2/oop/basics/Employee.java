package com.lti.training.day2.oop.basics;

public class Employee {
	
	private int empno;
	private String name;
	private String dateOfJoining;
	private double salary;

	//has - a realtionship
	//association
	//one to one association
	
	private Passport passport;
	
	private AadharCard aadharCard;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public AadharCard getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}
	

	public void displayInfo() {
		
		System.out.println("Empno"+empno);
		System.out.println("Name"+name);
		System.out.println("Pass no"+passport.getIssueDate());
		System.out.println("ExpiryDate is" +passport.getExpiryDate());
	
		System.out.println("Aadhar card no"+aadharCard.getAadharNo());
		System.out.println("Aadhar card name"+aadharCard.getName() );
		System.out.println("address"+aadharCard.getAddress());
		
		
		
	}
	

}
