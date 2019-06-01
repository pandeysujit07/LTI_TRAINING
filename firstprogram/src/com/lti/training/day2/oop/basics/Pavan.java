package com.lti.training.day2.oop.basics;

public class Pavan {

	public static void main(String args[])
	{
		Passport p1 = new Passport();
		p1.setPassportNo("*P123*");
		p1.setIssueDate("21-2019");
		p1.setExpiryDate("28-2-30");
		p1.setNameOfThePerson("PAVAN");
		
		AadharCard ac=new AadharCard(1234,"sujit","pune");
		
		
		Employee em=new Employee();
		em.setName("suj");
		em.setEmpno(123);
		em.setSalary(20000);
		
		em.setPassport(p1);// from main class object we can access the other variables
		em.setAadharCard(ac);
		
		
		System.out.println(em.getPassport().getPassportNo());
		System.out.println(em.getPassport().getIssueDate());
		System.out.println(em.getPassport().getExpiryDate());
		System.out.println(em.getPassport().getNameOfThePerson());
	
		System.out.println(ac.getAadharNo());
		System.out.println(ac.getName());
		System.out.println(ac.getAddress());
		
		System.out.println(em.getEmpno());
		System.out.println(em.getName());
		System.out.println(em.getSalary());
		
	
	}
	
}
