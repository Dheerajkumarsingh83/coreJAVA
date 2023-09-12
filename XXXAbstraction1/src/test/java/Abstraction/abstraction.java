package Abstraction;

abstract class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void sound();
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    public void sound() {
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    public void sound() {
        System.out.println(name + " meows");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog("Max");
        dog.sound();
        dog.sleep();
        
        Animal cat = new Cat("Luna");
        cat.sound();
        cat.sleep();
    }
}
