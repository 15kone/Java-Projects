package studentmanagement;

import java.util.Scanner;

public class Student {

	//required parameters
	private static int id = 1000;
	private final String email;
	private String course;
	private String firstName;
	private String lastName;
	private String city;
	private String country;
	private String zipCode;
	private int age;
	private int studentID;

	// constructor for students
	public Student() {
		// get the student's first and last name, and the course they are attending
		this.firstName = setFirstName();
		this.lastName = setLastName();
		this.course = setCourse();

		// Create the student's email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
			course.toLowerCase().replaceAll("\\s", "") + ".com";

		city = setCity();
		country = setCountry();
		zipCode = setZipCode();
		age = setAge();
		setStudentID();
	}

	// Generate an ID
	private void setStudentID() {
		// Course + ID
		id++;
		this.studentID = id;
	}


	// pick the course the student is attending
	private String setCourse() {
		Scanner in = new Scanner(System.in);
		System.out.print("""
			1) Computer Engineering
			2) Cyber Security
			3) Software Engineering\s
			""");
		System.out.print("Select the course the student is attending: ");
		int choice = in.nextInt();
		if (choice == 1) {
			course = "Computer Engineering";
		} else if (choice == 2) {
			course = "Cyber Security";
		} else if (choice == 3) {
			course = "Software Engineering";
		} else {
			System.out.println("Invalid choice, please enter a correct number.");
			setCourse();
		}
		return course;
	}

	// set the student's first name
	private String setFirstName() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the student's first name: ");
		firstName = in.nextLine();
		return firstName;
	}

	// set the student's last name
	private String setLastName() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the student's last name: ");
		lastName = in.nextLine();
		return lastName;
	}


	// set the student's nationality
	private String setCountry() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the student's nationality: ");
		country = in.nextLine();
		return country;
	}

	// set the student's city
	private String setCity() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the student's city: ");
		city = in.nextLine();
		return city;
	}

	// set the student's zip code
	private String setZipCode() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the student's zip-code: ");
		zipCode = in.nextLine();
		return zipCode;
	}

	// set the student's age
	private int setAge() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the student's age: ");
		age = in.nextInt();
		if (age < 18) {
			System.out.println("Our students cannot be under 18 years old.");
			setAge();
		}
		return age;
	}

	// to string method


	@Override
	public String toString() {
		return "Student{" +
			"email='" + email + '\'' +
			", course='" + course + '\'' +
			", firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", city='" + city + '\'' +
			", country='" + country + '\'' +
			", zipCode='" + zipCode + '\'' +
			", age=" + age +
			", studentID=" + studentID +
			'}';
	}
}