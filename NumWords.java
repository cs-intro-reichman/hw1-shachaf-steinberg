// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	int number = Integer.parseInt(args[0]);
	// extracting and printing out the hundres, tens and ones.
	System.out.println(number / 100 + " hundreds, " + (number % 100)/10 +
						" tens, " + number % 10 + " ones."); 
	}
}
