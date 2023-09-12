package method;

class Parent {
    public void display() {
        System.out.println("Parent's method");
    }
    
    public void display(int num) {
        System.out.println("Parent's overloaded method: " + num);
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child's overridden method");
    }
}

public class overloadedandoverriddenATsametime {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Parent's method
        parent.display(10); // Parent's overloaded method: 10
        Child child = new Child();
        child.display(); // Child's overridden method
        child.display(20); // Parent's overloaded method: 20
        Parent parent2 = new Child();
        parent2.display(); // Child's overridden method
        parent2.display(30); // Parent's overloaded method: 30
    }
}
