package methodsAssignment;

import java.util.InputMismatchException;

public class Methods {
	public static void ageMethod() {
		boolean badInput = true;

		do {
			try {
				System.out.print("\nHow old are you: ");
				MainClass.age = MainClass.in.nextInt();

				badInput = false;
			} catch (InputMismatchException ime) {
				MainClass.marquee("Please enter a whole number!");
				badInput = true;
				MainClass.in.next(); // clear the buffer
			} // end catch
		} while (badInput);

		String mess = "You are " + MainClass.age + " years old.\n";
		System.out.println(mess);

	} // end of ageMethod

}
