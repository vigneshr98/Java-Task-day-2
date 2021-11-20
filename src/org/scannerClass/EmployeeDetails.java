package org.scannerClass;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);

		System.out.println("Employee Id ??");
		int a = s.nextInt();         //s.nextInt()+ctrl2+l to get reurn type

		System.out.println("Employee id="+a);
		System.out.println("Employee Full Name??");
		String c = s1.nextLine();
		System.out.println("Employee Full Name="+c);
		System.out.println("employee initial");
		char d = s1.nextLine().charAt(8);
		System.out.println("Emp Initial ="+d);
		System.out.println("Employee Email Id ??");
		String e = s.next();
		System.out.println("Employee Email Id="+e);
		System.out.println("Employee Phone No??");
		long f = s.nextLong();
		System.out.println("Employee Phone No="+f);
		System.out.println("Employee Salary??");
		double g = s.nextDouble();
		System.out.println("Employee Salary="+g);
		 System.out.println("Employee Gender??");
		String h = s.next();
		System.out.println("Employee Gender="+h);
		System.out.println("Employee City??");
		String i = s.next();
		System.out.println("Employee City="+i);
		
	}
}
