package studentmanagement;

import java.util.Scanner;

public class StudentManagementApp {

	public static void main(String[] args) {
		// Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];

		// Create said number of students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
		}

		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n]);
		}

	}
}
