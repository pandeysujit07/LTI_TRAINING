package com.lti.training.day2.oop.basics;

public class Mainn {

	public static void main(String args[])
	{
	
		Address ad=new Address();
		ad.setCity("Mumbai");
		ad.setState("Maharastra");
		ad.setPincode(543525);
		
		Customer cu=new Customer();
		cu.setName("Sujit");
		cu.setEmail("suti@gmail.com");
		
		cu.setAddress(ad);
		cu.display();
	
		
		
		
		
	}
	
	
	
	
}
