package com.lab.practice;
import java.util.Scanner;

public class Number2b {
	static int num;
	public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	if(num>=0)
	{
		System.out.println("Positive Number");
	}
	else
	{
		System.out.println("Negative Number");
	}

	}

}

