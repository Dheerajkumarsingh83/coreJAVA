package method;

public class OVERLOADING {
	 public static void main(String[] args) {
	        int sum1 = addNumbers(5, 10);
	        int sum2 = addNumbers(5, 10, 15);
	        System.out.println("Sum 1: " + sum1);
	        System.out.println("Sum 2: " + sum2);
	    }
	    
	    public static int addNumbers(int a, int b) {
	        return a + b;
	    }
	    
	    public static int addNumbers(int a, int b, int c) {
	        return a + b + c;
	    }
}
