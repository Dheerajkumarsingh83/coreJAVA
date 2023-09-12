package ReverseString;

public class UsingStringBuffer {
    public static String reverseString(String input) {
        StringBuffer reversed = new StringBuffer(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}
