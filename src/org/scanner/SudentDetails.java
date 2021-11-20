package org.scanner;

import java.util.Scanner;

public class SudentDetails {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("ID");
		int b = s.nextInt();
		System.out.println("ID=" + b);

		System.out.println("name");
		String a = s.next();
		System.out.println("name=" + a);

		System.out.println("email");
		String c = s.next();
		System.out.println("email=" + c);

		System.out.println("phone no");
		long d = s.nextLong();
		System.out.println("phone no=" + d);

		System.out.println("dept");
		String g = s.next();
		System.out.println("dept=" + g);

		System.out.println("gender");
		String e = s.next();
		System.out.println("gender=" + e);

		System.out.println("city");
		String f = s.next();
		System.out.println("city=" + f);

	}

}
