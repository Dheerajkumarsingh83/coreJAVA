package OVERRIDING;

class Parent {
    public void display() {
        System.out.println("Parent's method");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child's method");
    }
}

public class OVERRIDING {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Parent's method
        Child child = new Child();
        child.display(); // Child's method
        Parent parent2 = new Child();
        parent2.display(); // Child's method
    }
}
