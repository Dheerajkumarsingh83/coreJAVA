package SQUAREROOToftwonumber;

public class UsingtheMath_sqrtmethod {
	 public static double calculateSquareRoot(double number) {
	        return Math.sqrt(number);
	    }

	    public static void main(String[] args) {
	        double number = 25.0;
	        double squareRoot = calculateSquareRoot(number);
	        System.out.println("Square root of " + number + " is: " + squareRoot);
	    }
}
