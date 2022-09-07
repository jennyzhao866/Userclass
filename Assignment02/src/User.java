/*
 * 
 * Student Name: Mian zhao
 * Lab Professor: Professor Neda Nabavi
 * Due Date: July 29,2022.
 * Modified: July 29, 2022.
 * Description: Assignment02,class User
  */

/* 
 *  This class provides utility for getting user input from the console using
 * an instance of Scanner set to new Scanner(System.in)	
 */
import java.util.Scanner;

public class User {

	private Scanner keyboard = new Scanner(System.in);

	/*
	 * Use Scanner to receive an integer of the user input ,then return the integer
	 */
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}

	/*
	 * Use the argument "message" to prompt the user,then call inputInteger() return
	 * the integer
	 */
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}

	/*
	 * Use Scanner to receive a double of the user input ,then return the double
	 */
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;
	}

	/*
	 * Use the argument "message" to prompt the user,then call inputDouble() return
	 * the a number with decimal
	 */
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
	/*
	 * public String inputString() { String value = keyboard.next();
	 * keyboard.nextLine(); return value; }
	 * 
	 * public String inputString(String message) { System.out.println(message);
	 * String value = inputString(); return value; }
	 */
}