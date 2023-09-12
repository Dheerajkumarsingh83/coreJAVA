package ArmstrongNumber;

public class UsingStringConversion {
    public static boolean isArmstrong(int number) {
        String numberStr = String.valueOf(number);
        int digits = numberStr.length();
        int sum = 0;

        for (int i = 0; i < digits; i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += Math.pow(digit, digits);
        }

        return number == sum;
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
