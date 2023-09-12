package UNCHECKEDEXCEPTION;

public class NullPointerExceptionHandle {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // NullPointerException
            System.out.println("Length: " + length);
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException occurred: " + ex.getMessage());
        }
    }
}
