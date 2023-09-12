package Factorial;
public class IterativeApproach {
    public static long factorialIterative(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        long factorial = factorialIterative(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}






