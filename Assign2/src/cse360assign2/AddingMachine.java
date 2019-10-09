//Name: Alex Cyrwus
//ID: 1213430333
//Assignment: assign2
package cse360assign2;
/*
 * @author: Alex Cyrwus
 * 
 * Repo Link: https://github.com/acyrwus/Assign2.git
 * 
 * This class functions as a simple calculator
 * It also has the ability to keep track of the commands it has used.
 */

public class AddingMachine {

	private int total;
	private String receipt;
	
	public AddingMachine () {
		total = 0;
		receipt = "0";  
	}
	
	/*
	 * Getter for total
	 * @return: Total value
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * Adds the value to the total
	 * @param: The value you want to get added to the total
	 */
	
	public void add (int value) {
		total += value;
		receipt = receipt + " + " + Integer.toString(value);
	}
	
	/*
	 * Subtracts the value from the Total
	 * @param: The value you want to be subtracted from Total
	 */
	
	public void subtract (int value) {
		total -= value;
		receipt = receipt + " - " + Integer.toString(value);
	}
	
	/*
	 * Gives a log of all calculations done in the class
	 * @return: A string containing the calculations done in the class
	 */
	
	public String toString () {
		return receipt;
	}

	/*
	 * Resets the total and string
	 */
	
	public void clear() {
		total = 0;
		receipt = "0";
	}
}
