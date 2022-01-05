package com.mindtree.service;

import com.mindtree.client.StudentApp;
import com.mindtree.entity.Student;

public class StudentAppService {

	public static void displayStudentWithHighestMarks(Student[] students) {
		int index = 0;
		int marks = students[index].getMarks();
		
		for (int i = 1; i < students.length; i++) {
			if (students[i].getMarks() > marks) {
				marks = students[i].getMarks();
				index++;
			}
		}
		StudentApp.displayStudentDetails(students);
	}
}
