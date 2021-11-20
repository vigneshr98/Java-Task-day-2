package org.college;

public class Student extends College{
	public void studentName() {
		System.out.println("Vignesh R");
		}
		public void studentDept() {
	System.out.println("Mechanical Engineering");
		}
		public void studentId() {
			System.out.println("622515114175");
		}
		public static void main(String[] args) {
			Student s=new Student();
			s.collegeCode();
			s.collegeName();
			s.collegeRank();
			s.deptName();
			s.hostelName();
			s.studentId();
			s.studentDept();
			s.studentName();
		}

}
