package com.patrickgramatowski;

import java.util.Scanner;

public class Email {
	private String userName;
	private String userLastName;
	private String department;
	private String password;
	private int mailboxCapacity = 500;
	private String email;
	private String alternateEmail;
	private String companySuffix = "javaGit.com";
	
	// Constructor
	public Email(String userName, String userLastName) {
		this.userName = userName;
		this.userLastName = userLastName;
		System.out.println("Hi " + this.userName + "!");
		// Call a method asking for deparmtment / returns the department
		this.department = setDepartment();
		System.out.println("You choose: " + this.department.toUpperCase());
		System.out.println();
		// Call a method that returns a random password
		System.out.println("Enter a random (5+) number to generate a password: ");
		int check = 0;
		do {
			Scanner passLength = new Scanner(System.in);
			int length = passLength.nextInt();
			check = length;
			if(length >= 5) {
				this.password = randomPassword(length);
				System.out.println("Your password is: " + this.password);
				System.out.println("Keep it safe!");
			} else {
				System.out.println("Your password is too weak! Try again, Length >= 5:");
			}
		}while(check < 5);
		System.out.println();
		
		// Creating email
		System.out.println("We have created an emial for You: ");
		email = this.userName.toLowerCase() + "." + this.userLastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
		System.out.println("Email created: " + email);
		System.out.println();
		
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("Enter the department:\n1.Sales\n2.Development\n3.Accounting\n4.None");
		System.out.println("\nEnter: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		switch(depChoice) {
			case 1:
				return "sales";
			case 2:
				return "dev";
			case 3:
				return "acct";
			case 4:
				return "none";
			default:
				return "Error, bad input!";
		}
	}
	
	// Generate random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWVXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change password
	public void changePassword(String password) {
		this.password = password;
		System.out.println("Your new password is: " + this.password);
	}
	
	public int getMailboxCapacity(){ 
		return mailboxCapacity; 
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return ("Name: " + userName + userLastName + 
			   "\nEmail: " + email + 
			   "\nMailbox Capacity: " + mailboxCapacity + "mb" + 
			   "\nPassword: " + password);
	}
	
}
	

