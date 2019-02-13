package com.lab.practice;

import java.util.Scanner;

public class PersonMain2d {
private static long num;
	public static void main(String[] args) {
		System.out.println("Enter Phone Number");
		Scanner s=new Scanner(System.in);
		num=s.nextLong();
		
	Person per1=new Person2d("Divya","Bharathi",'F');
	System.out.println("Personal Details:");
	System.out.println("---------------");
	System.out.println("FirstName:"+per1.getFirstName());
	System.out.println("LastName:"+per1.getLastName());
	System.out.println("Gender:"+per1.getGender());
	System.out.println("PhoneNumber:"+num);
	}

}
