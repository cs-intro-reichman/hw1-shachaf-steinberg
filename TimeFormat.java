// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// Deduct 12 if hours is bigger then 13 to get 12-hour AM/PM format.
		String time = "";
		
		
		if (hours >= 12) {
			time = "PM";
			hours -= 12;
		} else {
			time = "AM";
		}
		
		if (minutes < 10) {
			System.out.println(hours + ":0" + minutes + " " + time);
		} else {
		System.out.println(hours + ":" + minutes + " " + time);
		}
	}
}


			

