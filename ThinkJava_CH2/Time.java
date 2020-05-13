public class Time {

	public static void main(String[] args) {
		
		// Firstly, declare the initial variable names for the date and initial time.
		
		int hour, minute, second, secondsPassedSinceMidnight, secondsRemainingInDay, percentOfDay;
		
		// Then assign them values.
		
		hour = 14;
		minute = 22;
		second = 50;
		secondsPassedSinceMidnight = second + minute * 60 + hour * 3600;
		secondsRemainingInDay = 86000 - secondsPassedSinceMidnight;
		percentOfDay = secondsPassedSinceMidnight * 100 / 86000;
		
		// Print out the initial information.
		
		System.out.println("The number of seconds that have passed since midnight are: " + secondsPassedSinceMidnight);
		System.out.println("The number of seconds that are remaining today are: " + secondsRemainingInDay);
		System.out.println("The percentage of the day that has passed is: " + percentOfDay + "%");
		
		// Assign the next set of required variables for the
		// current time that has elapsed since the start of the exercise.
		
		int currentHour, currentMinute, currentSecond, currentSecondsPassedSinceMidnight;
		
		// Assign the values.
		
		currentHour = 14;
		currentMinute = 57;
		currentSecond = 8;
		currentSecondsPassedSinceMidnight = currentSecond + currentMinute * 60 + currentHour * 3600;
		
		// Calculate the time that has elapsed.
		
		int timeElapsed = currentSecondsPassedSinceMidnight - secondsPassedSinceMidnight;
		
		// Print out the calculated number.
		
		System.out.println("The seconds that have elapsed since I started this exercise are: " + timeElapsed);
		
	}

}
