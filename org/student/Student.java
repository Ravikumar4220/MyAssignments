package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Ravikumar.M");
	}
	public void studentDept() {
		System.out.println("Civil Engineering");
	}
	public void studentId() {
		System.out.println("03");
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
	}
