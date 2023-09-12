package singleinheritance;

class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving the vehicle");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.drive(); // Inherited from Vehicle class
        car.displayDetails(); // Specific to Car class
    }
}