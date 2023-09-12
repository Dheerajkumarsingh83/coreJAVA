package PrintrepeatedcharactersofString;

public class UsinganArray {
	public static void printRepeatedCharacters(String input) {
        int[] charCount = new int[256];

        for (char ch : input.toCharArray()) {
            charCount[ch]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println("Character '" + (char) i + "' is repeated " + charCount[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        printRepeatedCharacters(input);
    }
}
