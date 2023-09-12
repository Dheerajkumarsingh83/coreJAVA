package ReverseString;

public class UsingRecursion {
	   public static String reverseString(String input) {
	        if (input.isEmpty()) {
	            return input;
	        }

	        return reverseString(input.substring(1)) + input.charAt(0);
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        String reversed = reverseString(input);
	        System.out.println("Reversed String: " + reversed);
	    }
	}

