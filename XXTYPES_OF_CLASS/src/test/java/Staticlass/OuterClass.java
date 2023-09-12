package Staticlass;

public class OuterClass {
    private static int outerStaticVar = 10;
    private int outerInstanceVar = 20;

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Outer static variable: " + outerStaticVar);
            // Cannot access outerInstanceVar directly from static context
        }
    }

    public static void main(String[] args) {
        // Accessing static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();
    }
}

