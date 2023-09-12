package method;

public class methodsignatureANDmethodbody {
	public static void main(String[] args) {
        int result = addNumbers(5, 10); // Method signature
        System.out.println("Sum: " + result);
    }
    
    public static int addNumbers(int a, int b) { // Method signature
        int sum = a + b; // Method body
        return sum; // Method body
    }
}
