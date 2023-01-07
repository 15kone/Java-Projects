package studentmanagement;

import java.util.Random;
import java.util.Scanner;

public class Student {

		//required parameters
		private final String email;
		private final int id;
		private String firstName;
		private String lastName;
		private String major;
		private String uniSuffix;
		private String city;
		private String country;
		private String zipCode;
		private int age;


		// constructor for students
		public Student() {
				this.firstName = setFirstName();
				this.lastName = setLastName();

				this.major = setMajor();
				this.uniSuffix = setUniversity();

				email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +
						uniSuffix.toLowerCase() + ".com";

				city = setCity();
				country = setCountry();
				zipCode = setZipCode();
				age = setAge();
				this.id = setId();
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

		// set the university the student is attending
		private String setUniversity() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the university suffix: ");
				uniSuffix = in.nextLine();
				return uniSuffix;
		}

		// set the major the student's attending
		private String setMajor() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the student's major: ");
				major = in.nextLine();
				return major;
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

		// set a random id in range specified below
		private int setId() {
				int id = (new Random()).nextInt(900000) + 10000;
				return id;
		}


		// to string method
		@Override
		public String toString() {
				return "Student{" +
						"email='" + email + '\'' +
						", firstName='" + firstName + '\'' +
						", lastName='" + lastName + '\'' +
						", major='" + major + '\'' +
						", uniSuffix='" + uniSuffix + '\'' +
						", city='" + city + '\'' +
						", country='" + country + '\'' +
						", zipCode='" + zipCode + '\'' +
						", age=" + age +
						", id=" + id +
						'}';
		}
}