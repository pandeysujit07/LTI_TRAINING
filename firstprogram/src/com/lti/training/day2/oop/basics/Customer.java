package com.lti.training.day2.oop.basics;

public class Customer {

     	private String name;
	    private String email;
	
	    private  Address address;  //has a relationship(Every customer has a address)

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
	    
	   void display()
	   {
		   System.out.println(name);
		   System.out.println(email);
		   System.out.println(address.getCity());
		   System.out.println(address.getState());
		   System.out.println(address.getPincode());
	   }

}
