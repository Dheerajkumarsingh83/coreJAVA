package ArmstrongNumber;

public class UsingRecursion {

	  public static boolean isArmstrong(int number) {
	        int digits = (int) Math.log10(number) + 1;
	        int sum = calculateArmstrongSum(number, digits);
	        return number == sum;
	    }

	    public static int calculateArmstrongSum(int number, int digits) {
	        if (number == 0) {
	            return 0;
	        }

	        int digit = number % 10;
	        return (int) Math.pow(digit, digits) + calculateArmstrongSum(number / 10, digits);
	    }

	    public static void main(String[] args) {
	        int number = 153;

	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}