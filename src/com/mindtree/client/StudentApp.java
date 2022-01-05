package com.mindtree.client;

import java.util.Scanner;
import com.mindtree.entity.Student;
import com.mindtree.service.StudentAppService;

public class StudentApp {
	static Scanner scan = new Scanner(System.in);
 
	public static void main(String[] args) {
		System.out.println("Enter number of Students");
		System.out.println("Hello , i am doing sample for git");
		int studentCount = scan.nextInt();

		Student[] students = new Student[studentCount];
		// methods
		insertStudentDetails(students);
		displayStudentDetails(students);
		System.out.println("The highest is for");
		StudentAppService.displayStudentWithHighestMarks(students);
	}

	public static void insertStudentDetails(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter student id");
			int id = scan.nextInt();
			System.out.println("Enter student name");
			scan.nextLine();
			String name = scan.next();
			System.out.println("Enter student branch");
			String branch = scan.next();
			System.out.println("Enter student marks");
			int marks = scan.nextInt();
			System.out.println("Enter student grade");
			String grade = scan.next();
			
			students[i] = new Student(id, name, branch, marks,grade);
		}

	}

	public static void displayStudentDetails(Student[] students) {

		System.out.println("The details of students are");
		for (int i = 0; i < students.length; i++) {
			System.out.println(" " + students[i].getId());
			System.out.println(" " + students[i].getName());
			System.out.println(" " + students[i].getBranch());
			System.out.println(" " + students[i].getMarks());
			System.out.println("=========");
		}

	}

}
