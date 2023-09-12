package CHECKEDEXCEPTION;

public class CLassNotFoundExceptionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.example.MyClass");
    }
}
