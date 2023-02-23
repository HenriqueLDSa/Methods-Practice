package methodsAssignment;

import java.util.*;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static String firstName;
	public static String lastName;
	public static int age;

	public static void main(String[] args) {
		char choice = ' ';
		do {
			choice = getChoice();
			switch (choice) {
			case 'A': // age method
				Methods.ageMethod();
				break;
			case 'N': // name method
				nameMethod();
				break;
			case 'Q': // quit program
				outputMethod();
				marquee("Thanks for using my program!");
				break;
			default:
				marquee("Please enter from the options below!");
				break;
			} // end switch
			
		} while (choice != 'Q'); 

	} // end main

/////////////////////////////////////////////////////////////////////////////////////////

	public static char getChoice() {
		char result = ' ';
		displayTheMenu();

		result = in.next().toUpperCase().charAt(0);
		return result;

	} // end getChoice

/////////////////////////////////////////////////////////////////////////////////////////

	public static void displayTheMenu() {
		// System.out.println("** MAIN MENU **");
		marquee("MAIN MENU");
		System.out.println("[A]ge");
		System.out.println("[N]ame");
		System.out.println("[Q]uit");
		System.out.print("\nEnter selection: ");
	} // end of displayTheMenu

/////////////////////////////////////////////////////////////////////////////////////////

	public static void marquee(String mess) {
		int size = mess.length() + 6;
		for (int i = 0; i < size; i++)
			System.out.print("*");
		System.out.println("\n" + "** " + mess + " **");
		for (int i = 0; i < size; i++)
			System.out.print("*");
		System.out.println();

	} // end of marquee

/////////////////////////////////////////////////////////////////////////////////////////

	public static void nameMethod() {
		
		System.out.print("What is your first name? ");
		firstName = in.next();
		
		System.out.print("What is your last name? ");
		lastName = in.next();
		
		String mess = "\nYour name is " + firstName + " " + lastName + ". Pretty cool!\n";
		System.out.println(mess);

	} // end of nameMethod

/////////////////////////////////////////////////////////////////////////////////////////

	public static void outputMethod() {
				
		if (age > 50) {
			System.out.println("Hello, " + firstName + " " + lastName + ". Since you are " + age + " years old, you are really old!");
		}
		if (age < 21) {
			System.out.println("Hello, " + firstName + " " + lastName + ". Since you are " + age + " years old, you are really young!");
		} else {
			System.out.println("Hello, " + firstName + " " + lastName + ". Since you are " + age + " years old, you are doing just fine!");
		}
	}
} // end of Class