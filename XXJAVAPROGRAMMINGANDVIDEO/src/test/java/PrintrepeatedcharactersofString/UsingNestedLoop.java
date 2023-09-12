package PrintrepeatedcharactersofString;

public class UsingNestedLoop {
	  public static void printRepeatedCharacters(String input) {
	        for (int i = 0; i < input.length() - 1; i++) {
	            char ch = input.charAt(i);
	            if (ch != ' ') {
	                for (int j = i + 1; j < input.length(); j++) {
	                    if (ch == input.charAt(j)) {
	                        System.out.println("Character '" + ch + "' is repeated");
	                        break;
	                    }
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        printRepeatedCharacters(input);
	    }
}
