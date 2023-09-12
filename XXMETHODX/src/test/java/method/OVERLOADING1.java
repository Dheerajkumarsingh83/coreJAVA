package method;

public class OVERLOADING1 {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int sum1 = addNumbers(10, 20);
        int sum2 = addNumbers(10, 20, 30);
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
    }
}
