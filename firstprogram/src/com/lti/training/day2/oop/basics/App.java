package com.lti.training.day2.oop.basics;

public class App {

	public static void main(String[] args) {
		//creating object of passport class
		Passport p1 = new Passport();
		p1.setPassportNo("*P123*");
		p1.setIssueDate("21-2019");
		p1.setExpiryDate("28-2-30");
		p1.setNameOfThePerson("PAVAN");
		
		System.out.println(p1.getPassportNo());
		System.out.println(p1.getIssueDate());
		System.out.println(p1.getExpiryDate());
		System.out.println(p1.getNameOfThePerson());
       
		AadharCard ac=new AadharCard(123,"suj","mumbai");
      System.out.println(ac.getAadharNo());
      System.out.println(ac.getName());
      System.out.println(ac.getAddress());
	}
	
}
