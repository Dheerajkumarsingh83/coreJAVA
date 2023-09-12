package Factorial;

public class RecursiveApproach {
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        long factorial = factorialRecursive(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}