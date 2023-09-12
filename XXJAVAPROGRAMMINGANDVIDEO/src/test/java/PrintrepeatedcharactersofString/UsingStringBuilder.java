package PrintrepeatedcharactersofString;

public class UsingStringBuilder {
	 public static void printRepeatedCharacters(String input) {
	        StringBuilder repeatedChars = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (input.lastIndexOf(ch) > i && repeatedChars.indexOf(Character.toString(ch)) == -1) {
	                System.out.println("Character '" + ch + "' is repeated");
	                repeatedChars.append(ch);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        printRepeatedCharacters(input);
	    }
}
