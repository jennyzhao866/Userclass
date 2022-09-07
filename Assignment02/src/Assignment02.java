import java.util.Scanner;

/*
 * 
 * Student Name: Mian zhao
 * Lab Professor: Professor Neda Nabavi
 * Due Date: July 29,2022.
 * Modified: July 29, 2022.
 * Description: According to the size,verify the weight is good or not,then count the
 * good bags,bad bags and total bags.The program will not end until the user input a String(not YES )
 * input:ask for bag size and weight,ask if continue (Yes, No) 
 *       continuing on any Yes (not case sensitive)
 * processing:According to the users'input,call methods in class PotatoChip to verify 
 *        the bag is good or not,count the number of bags
 * output:the total bags verified,the number of good bags and bad bags, author name
 */

/*
 * Class that launches the program, contains method main.
 */

public class Assignment02 {

	/*
	 * entry point for the program
	 */
	public static void main(String[] args) {
		PotatoChipBag bag = new PotatoChipBag();
		User user = new User();
		Scanner keyboard = new Scanner(System.in);

		int size;
		double weight;
		final int REGULAR = 1;
		final int LARGE = 2;
		String option;
		int goodbag = 0;
		int badbag = 0;
		boolean isContinue;

		/*
		 * Loop,continue receive a string (not “yes”，no case sensitive )
		 */
		do {

			size = user.inputInteger("Enter bag size:\n1 for regular size:\n2 for regular size:");
			/*
			 * according to the input size, decide call method or output invalid input
			 */
			if (size == REGULAR || size == LARGE) {
				weight = user.inputDouble("Enter weight: ");
				bag.setSize(size);
				bag.setWeight(weight);
				if (bag.isBagCorrectWeight())
					goodbag++;
				else
					badbag++;

				System.out.printf("Good bags: %d\nBad bags:%d\nTotal bags:%d\n", goodbag, badbag, (goodbag + badbag));

			} else
				System.out.println("invalid bag size entered");

			System.out.println("Program by Mianzhao");
			System.out.println("Continue Program? (yes/no)");
			option = keyboard.next();
			if (option.toLowerCase().equals("yes")) {
				isContinue = true;
			} else {
				isContinue = false;
				System.out.println("Program has shut down");
			}
			// } while (user.inputString("Continue Program?
			// (yes/no)").toLowerCase().equals("yes"));
		} while (isContinue);
	}

}