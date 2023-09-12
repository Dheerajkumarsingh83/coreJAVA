package method;

public class methodsignatureANDmethodbody1 {
    // Method signature: methodName(parameterList)
    public static int addNumbers(int a, int b) {
        // Method body
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int result = addNumbers(10, 20);
        System.out.println("Sum: " + result);
    }
}