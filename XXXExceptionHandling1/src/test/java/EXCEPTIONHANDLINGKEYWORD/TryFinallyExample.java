package EXCEPTIONHANDLINGKEYWORD;

public class TryFinallyExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            System.out.println("Inside try block");
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } finally {
            // Code that is always executed
            System.out.println("Inside finally block");
            cleanup();
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void cleanup() {
        System.out.println("Performing cleanup");
        // Perform necessary cleanup tasks
    }
}
