package blinmaker;

import java.util.Scanner;

public class id {

	public static void main(String[] args) {
		
		String MyName = "Kostas";
		int MyAge = 21;
		
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("What is you're name?");
		
		 
		 String MyName1 = myObj.nextLine();
		 
		 System.out.println("You're name is " + MyName1);
		 System.out.println("Now you're username");
		 
		 
		 String MyName11 = myObj.nextLine();
		 
		 System.out.println("You're username is " + MyName11);
		 
		 System.out.println("What is you're age");
		 String MyAge1 = myObj.nextLine();
		 
		 System.out.println("You're age is " + MyAge1);
		 
		 System.out.println("So you're name is " + MyName1);
		 System.out.println("You're username is " + MyName11);
		 System.out.println("You're age is " + MyAge1);
		 System.out.println("I will compile it and add it to the database");
		 System.out.println("Shuting Down...");
	}

}
