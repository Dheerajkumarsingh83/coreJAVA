package AbstractClass;

abstract class Shape {
    private String color;
    
    // Constructor
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract method
    public abstract double calculateArea();
    
    // Concrete method
    public void display() {
        System.out.println("This shape is " + color + ".");
    }
}

class Circle extends Shape {
    private double radius;
    
    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    // Implementing abstract method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    // Implementing abstract method
    public double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.display();
        System.out.println("Area: " + circle.calculateArea());
        
        Rectangle rectangle = new Rectangle("Blue", 3.0, 4.0);
        rectangle.display();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}

