public class Date {

	public static void main(String[] args) {
		
		// Firstly, declare the variable names.
		
		int date, year;
		String day, month;
		
		// Then assign the values.
		
		date = 11;
		year = 2020;
		day = "Monday";
		month = "May";
		
		// Lastly, display the required information on the
		// console using the "println" method, the required
		// variables and concatenation.
		
		System.out.println(day);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		System.out.println("American Format: " + day + ", " + month + " " + date + ", " + year);
		System.out.println("European Format: " + day + " " + date + " " + month + " " + year);

	}

}
