package ReverseString;

public class UsingStringBuilder {
	    public static String reverseString(String input) {
	        StringBuilder reversed = new StringBuilder(input);
	        return reversed.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        String reversed = reverseString(input);
	        System.out.println("Reversed String: " + reversed);
	    }
	}