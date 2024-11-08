
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		// Computes the future value of a saving investment.
		int futureValue = (int)(currentValue * Math.pow((1 + rate/100),n));

		System.out.println("After " + n + " years, a $" + currentValue +
		" saved at " + rate + "% will yield $" + futureValue);
	}
}