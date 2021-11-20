package org.studentMarks;
import java.util.Scanner;
public class StudentData {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Student Name??");
		String a = s.next();
		System.out.println("student name="+a);
		System.out.println("Student id??");
		int b = s.nextInt();
		System.out.println("student id="+b);	
		System.out.println("mark 1??");
		int c = s.nextInt();
		System.out.println("mark 1="+c);
		System.out.println("mark 2??");
		int d = s.nextInt();
		System.out.println("mark 2="+d);	
		System.out.println("mark 3??");
		int e = s.nextInt();
		System.out.println("mark 3="+e);
		System.out.println("mark 4??");
		int f = s.nextInt();
		System.out.println("mark 4="+f);
		System.out.println("mark 5??");
		int g = s.nextInt();
		System.out.println("mark 5="+g);
		System.out.println("total");

		int i=(c+d+e+f+g);

		System.out.println("total="+i);
		System.out.println("average??");
		
		double h = (c+d+e+f+g) / 5;
		
		System.out.println("average marks="+h);
	}}
