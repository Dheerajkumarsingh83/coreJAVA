package AccessModifier;

public class accessmodifiers {
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
    
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    
    void defaultMethod() {
        System.out.println("This is a default method.");
    }
    
    public static void main(String[] args) {
        accessmodifiers example = new accessmodifiers();
        example.publicMethod(); // This is a public method.
        example.protectedMethod(); // This is a protected method.
        example.privateMethod(); // This is a private method.
        example.defaultMethod(); // This is a default method.
    }
}