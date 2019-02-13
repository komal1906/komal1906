package com.lab.practice;

public class PersonMain2c {

	public static void main(String[] args) {
	Person per1=new Person2c("Divya","Bharathi",'F');
	System.out.println("Personal Details:");
	System.out.println("---------------");
	System.out.println("FirstName:"+per1.getFirstName());
	System.out.println("LastName:"+per1.getLastName());
	System.out.println("Gender"+per1.getGender());
	}

}

