// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// Deduct 12 if hours is bigger then 13 to get 12-hour AM/PM format.
		if (hours >= 13) {
			hours -= 12;
		} 
		
		System.out.print(hours + ":" + minutes);
	}
}