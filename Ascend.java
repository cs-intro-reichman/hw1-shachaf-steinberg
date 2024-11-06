// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		// get 3 random values and multiply by limit in order to get a number inside our range.
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		// find the smallest number
		int min = Math.min(a,b);
		int finalMin = Math.min(min,c);
		// find the biggest number
		int max = Math.max(a,b);
		int finalMax = Math.max(max,c);
		// Deduct the biggest and smallest number from the sum in order to get the middle number
		int mid = (a + b + c) - (finalMax + finalMin);

		System.out.println(a + " " + b + " " + c);
		System.out.println(finalMin + " " + mid + " " + finalMax);
	}
}
