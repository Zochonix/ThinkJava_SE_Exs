package ex4solutions;

/**
*
* Solution class for the first part of exercise 4. (4.1)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex4_1 {

	/**
	*
	* Displays the American and European format of a specified date.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
				
		/* Create two primitive integers to store the values for the month and the
		   day in the specified month. Also create two String variables to store the
		   name of the month as well as the current day (Monday, Tuesday etc). */
		
		int dayInMonth, year;
		String nameOfDay, month;
		
		// Assign the values to the declared variables.
		
		dayInMonth = 11;
		year = 2020;
		nameOfDay = "Monday";
		month = "May";
		
		/* Display the information collected on the console using
		   the "println" method. */
		
		System.out.println(nameOfDay);
		System.out.println(dayInMonth);
		System.out.println(month);
		System.out.println(year);

		/* Call the printAmerican and printEuropean methods to display the different
		   formats of the date using the collected inputs as arguments. */
		
		printAmerican(nameOfDay, dayInMonth, month, year);
		printEuropean(nameOfDay, dayInMonth, month, year);

	}

	/**
	*
	* Uses given arguments to produce and display a date in the American format. 
	*
	* @param nameOfDay The name of the day
	* @param dayInMonth The numerical representation of the day in the month.
	* @param month The numerical value of the month in the year
	* @param year The numerical value of the year.
	*
	*/
	
	public static void printAmerican(String nameOfDay, int dayInMonth,
	String month, int year) {
		
		System.out.println("American Format: " + nameOfDay + " " + month + " " +
		dayInMonth + " " + year);
		
	}

	/**
	*
	* Uses given arguments to produce and display a date in the European format. 
	*
	* @param nameOfDay The name of the day
	* @param dayInMonth The numerical representation of the day in the month.
	* @param month The numerical value of the month in the year
	* @param year The numerical value of the year.
	*
	*/
	
	public static void printEuropean(String nameOfDay, int dayInMonth,
	String month, int year) {
		
		System.out.println("European Format: " + nameOfDay + " " + dayInMonth +
		" " + month + " " + year);
		
	}

}
