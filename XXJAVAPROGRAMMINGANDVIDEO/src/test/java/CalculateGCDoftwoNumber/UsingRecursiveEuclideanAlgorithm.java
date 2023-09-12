package CalculateGCDoftwoNumber;

public class UsingRecursiveEuclideanAlgorithm {
	public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
