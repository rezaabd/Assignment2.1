public class Day {
	//Attributes
	private String day;
	private String [] daysNameAbreviated = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	
/**
 * This is a constructor that initializes the Day value to Monday	
 */
	public Day(){
		this.day = "Mon ";
	}
/**
 * This method initializes a day of the week	
 * @param day day of the week in string type
 */
	public Day(String day) {
		this.day = day;
	}
/**
 * This method returns a particular day of the week
 * @return a specific day of the week
 */
	public String getDay() {
		return day;
	}
/**
 * This method sets any chosen day of the week
 * @param day a day of the week in string type
 */
	public void setDay(String day) {
		this.day = day;
	}
/**
 * This method is used to find the the next day after the one given by default
 * @return the following day after the given day
 */
	public String nextDay(){
		String message = "";
		int indexOfDay = getIndexOfDay(this.day);
		int afterToday = indexOfDay + 1;
		if(indexOfDay>=0){
			message = daysNameAbreviated[afterToday];
		} else {
			message = "Invalid day !";
		}
		
		return message;
	}
/**
 * This method helps find the correct index for the elements listed in the array	
 * @param day a day of the week in string type
 * @return an index for a specific day of the week
 */
	private int getIndexOfDay(String day){
		for(int i=0; i< daysNameAbreviated.length; i ++){
			if(daysNameAbreviated[i]== this.day){
				return i;
			}
		}
			
		return (-1);
	}
/**
 * 	This method is used to find the day before any day provided by default
 * @return the day before the actual given day
 */
	public String previousDay(){
		String message = "";
		int indexOfDay = getIndexOfDay(this.day);
		int beforeToday;
		if(indexOfDay>=0){
			beforeToday = indexOfDay + 6;
			message = daysNameAbreviated[(beforeToday)%7];
		} else {
			message = "Invalid day !";
		}
		return message;
	}
/**
 * This method is used to determine the specific day of the week in a near future
 * @param whatDays how many days ahead of the one given
 * @return any future day of the week
 */
	public String calculateOtherDays(int whatDays){
		String message = "";
		int indexOfDay = getIndexOfDay(this.day);
		int futureDays;
		if(indexOfDay>=0){
			futureDays = indexOfDay + whatDays;
			message = daysNameAbreviated[(futureDays)%7];
		} else {
			message = "Invalid day !";
		}
		
		return message;
	}
/**
 * This method displays all the information about the day of the week selected
 */
	public String toString() {
		return day;
	}
	
}
