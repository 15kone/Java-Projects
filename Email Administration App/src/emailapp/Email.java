package emailapp;

import java.util.Scanner;

public class Email {

		private final String firstName;
		private final String lastName;
		private final String email;
		private String password;
		private final String department;
		private String alternateEmail;
		private int mailboxCapacity = 500;
		private final int defaultPasswordLength = 10;
		private final String companySuffix = "aeycompany.com";

		// Constructor to receive the first name and last name

		public Email(String firstName, String lastName) {
				this.firstName = firstName;
				this.lastName = lastName;

				// Call a method asking for the department, return the department
				this.department = setDepartment();

				// Call a method that returns a random password
				this.password = randomPassword(defaultPasswordLength);
				System.out.println("Your password is: " + this.password);

				// Combine elements to generate email
				email =
						firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department
								+ "."
								+ companySuffix;

		}

		// Ask for the department

		public String setDepartment() {
				System.out.print("New worker: " + firstName + "\nDEPARTMENT CODES	"
						+ "\n1 "
						+ "for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
				Scanner in = new Scanner(System.in);
				int depChoice = in.nextInt();
				if (depChoice == 1) {
						return "Sales";
				} else if (depChoice == 2) {
						return "Development";
				} else if (depChoice == 3) {
						return "Accounting";
				} else {
						return "None";
				}
		}

		// Generate a random password
		private String randomPassword(int length) {
				String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ1234567890!@#$%";
				char[] password = new char[length];
				for (int i = 0; i < length; i++) {
						int rand = (int) (Math.random() * passwordSet.length());
						password[i] = passwordSet.charAt(rand);
				}
				return new String(password);
		}

		// Set the mailbox capacity

		// Change the password
		public void changePassword(String password) {
				this.password = password;
		}

		public int getMailboxCapacity() {
				return mailboxCapacity;
		}

		public void setMailboxCapacity(int capacity) {
				this.mailboxCapacity = capacity;
		}

		public String getAlternateEmail() {
				return alternateEmail;
		}

		// Set the alternate email
		public void setAlternateEmail(String altEmail) {
				this.alternateEmail = altEmail;
		}

		public String getPassword() {
				return password;
		}

		public String showInfo() {
				return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
						"COMPANY EMAIL: " + email + "\n" +
						"MAILBOX CAPACITY: " + mailboxCapacity + "mb" + "\n" +
						"DEPARTMENT: " + department;
		}

}
