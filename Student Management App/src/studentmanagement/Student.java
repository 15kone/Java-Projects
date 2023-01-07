package studentmanagement;

import java.util.Scanner;

public class Student {

		private final String email;
		private String firstName;
		private String lastName;
		private String major;
		private String uniSuffix;
		private String city;
		private String country;
		private String zipCode;
		private int age;

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

		}

		private String setFirstName() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the student's first name: ");
				firstName = in.nextLine();
				return firstName;
		}

		private String setLastName() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the student's last name: ");
				lastName = in.nextLine();
				return lastName;
		}

		private String setUniversity() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the university suffix: ");
				uniSuffix = in.nextLine();
				return uniSuffix;
		}

		private String setMajor() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the student's major: ");
				major = in.nextLine();
				return major;
		}

		private String setCountry() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the student's country: ");
				country = in.nextLine();
				return country;
		}

		private String setCity() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the student's city: ");
				city = in.nextLine();
				return city;
		}

		private String setZipCode() {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter the student's zip-code: ");
				zipCode = in.nextLine();
				return zipCode;
		}

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


		@Override
		public String toString() {
				return "Student{" +
						"firstName='" + firstName + '\'' +
						", lastName='" + lastName + '\'' +
						", email='" + email + '\'' +
						", university='" + uniSuffix + '\'' +
						", city='" + city + '\'' +
						", country='" + country + '\'' +
						", zipCode='" + zipCode + '\'' +
						", age=" + age +
						'}';
		}
}