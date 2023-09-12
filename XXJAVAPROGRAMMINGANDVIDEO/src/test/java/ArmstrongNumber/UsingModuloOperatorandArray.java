package ArmstrongNumber;

public class UsingModuloOperatorandArray {
	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int digits = (int) Math.log10(number) + 1;
	        int[] digitArray = new int[digits];
	        int sum = 0;
	        int index = digits - 1;

	        while (number != 0) {
	            int digit = number % 10;
	            digitArray[index--] = digit;
	            number /= 10;
	        }

	        for (int digit : digitArray) {
	            sum += Math.pow(digit, digits);
	        }

	        return originalNumber == sum;
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