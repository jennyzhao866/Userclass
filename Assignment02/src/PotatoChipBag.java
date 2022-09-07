/*
 * 
 * Student Name: Mian zhao
 * Lab Professor: Professor Neda Nabavi
 * Due Date: July 29,2022.
 * Modified: July 29, 2022.
 * Description: Assignment2 class PotatoChipBag
 */

/*
 * Class PotatoChipBag , with field weight,size and constants , default constructor,overload constructor
 * there a worker isBagCorrectWeight to verify the bag is good or not according to its size,return a boolean
 */
public class PotatoChipBag {
	private int size; // Regular or Large (use constants below)
	private double weight; // oz
	public static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; // oz
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75; // oz
	public static final double EPSILON = 0.01;// an EPSILON constant with value 0.01

	/*
	 * default constructor
	 */
	public PotatoChipBag() {
		this(REGULAR, REGULAR_WEIGHT);
	}

	/*
	 * overload constructor,sets size and weight based on parameter list
	 */
	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}

	/*
	 * accessor for size
	 */
	public int getSize() {
		return size;
	}

	/*
	 * mutator for size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/*
	 * accessor for weight
	 */
	public double getWeight() {
		return weight;
	}

	/*
	 * mutator for weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * according to the size, verify the weight is good or not,return true or false
	 * Math.abs from Java API Math class
	 */
	public boolean isBagCorrectWeight() {
		boolean result = false;

		if (this.size == REGULAR) {

			if (Math.abs(this.weight - REGULAR_WEIGHT) <= EPSILON)
				result = true;
			else
				result = false;
		} else if (Math.abs(this.weight - LARGE_WEIGHT) <= EPSILON) {
			result = true;
		} else
			result = false;

		return result;
	}

}