package method;

class Superclass {
    public static void display() {
        System.out.println("Superclass method");
    }
}

class Subclass extends Superclass {
    public static void display() {
        System.out.println("Subclass method");
    }
}

public class overridestaticmethod1 {
    public static void main(String[] args) {
        Superclass obj1 = new Superclass();
        obj1.display(); // Output: Superclass method

        Subclass obj2 = new Subclass();
        obj2.display(); // Output: Subclass method

        Superclass obj3 = new Subclass();
        obj3.display(); // Output: Superclass method
    }
}
