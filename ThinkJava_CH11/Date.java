/**
*
* Class representing a Date. (11.3)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Date {
	
	private int year;
	private int month;
	private int day;

	/**
	*
	* Default Date constructor. Creates a Date object with a given year, month and day.
	*
	*/
	
	public Date() {
		
		this.year = 2021;
		this.month = 8;
		this.day = 17;
		
	}

	/**
	*
	* Value Date constructor. Creates a Date object with a received year, month and day.
	*
	* @param year A numerical representation for a given year.
	* @param month A numerical representation of a certain month.
	* @param day A numerical representation for a day, within a certain month.
	*
	*/
	
	public Date(int year, int month, int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

}
