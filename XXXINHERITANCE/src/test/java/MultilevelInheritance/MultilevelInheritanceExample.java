package MultilevelInheritance;

class Grandparent {
    public void printGrandparent() {
        System.out.println("I am the grandparent.");
    }
}

class Parent extends Grandparent {
    public void printParent() {
        System.out.println("I am the parent.");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("I am the child.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.printGrandparent(); // Inherited from Grandparent class
        child.printParent(); // Inherited from Parent class
        child.printChild(); // Specific to Child class
    }
}