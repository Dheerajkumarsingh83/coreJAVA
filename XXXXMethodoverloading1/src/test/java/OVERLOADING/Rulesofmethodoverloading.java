package OVERLOADING;

public class Rulesofmethodoverloading {
    public static void main(String[] args) {
        addNumbers(5, 10); // Method 1
        addNumbers(5, 10.0); // Method 2
        addNumbers(5.0, 10); // Method 3
        addNumbers(5.0, 10.0); // Method 4
    }
    
    public static void addNumbers(int a, int b) {
        System.out.println("Method 1: " + (a + b));
    }
    
    public static void addNumbers(int a, double b) {
        System.out.println("Method 2: " + (a + b));
    }
    
    public static void addNumbers(double a, int b) {
        System.out.println("Method 3: " + (a + b));
    }
    
    public static void addNumbers(double a, double b) {
        System.out.println("Method 4: " + (a + b));
    }
}