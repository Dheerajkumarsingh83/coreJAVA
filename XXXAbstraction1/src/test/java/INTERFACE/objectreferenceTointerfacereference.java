package INTERFACE;

interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }
}

public class objectreferenceTointerfacereference {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod(); // Direct method invocation
        
        MyInterface intf = (MyInterface) obj; // Casting to interface
        intf.myMethod(); // Method invocation through interface reference
    }
}
