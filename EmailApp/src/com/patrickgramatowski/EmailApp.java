package com.patrickgramatowski;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Email sam = new Email("Sam", "Doe");
		
		// Ask if user wants to see info
		System.out.println("Do You want to check info? (y/n)");
		Scanner show = new Scanner(System.in);
		String showInfo = show.nextLine();
		if(showInfo.equals("y"))
			System.out.println(sam.showInfo());
		else
			System.out.println("Ok! Bye!");

	}

}
