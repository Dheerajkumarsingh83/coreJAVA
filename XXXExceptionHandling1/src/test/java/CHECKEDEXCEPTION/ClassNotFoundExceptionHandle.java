package CHECKEDEXCEPTION;

public class ClassNotFoundExceptionHandle {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}