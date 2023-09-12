package Abstraction;

abstract class Vehicle {
    private String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public abstract void start();
    
    public abstract void stop();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    
    public void start() {
        System.out.println("Starting the car");
    }
    
    public void stop() {
        System.out.println("Stopping the car");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
    
    public void start() {
        System.out.println("Starting the motorcycle");
    }
    
    public void stop() {
        System.out.println("Stopping the motorcycle");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        System.out.println("Brand: " + car.getBrand());
        car.start();
        car.stop();
        
        Vehicle motorcycle = new Motorcycle("Honda");
        System.out.println("Brand: " + motorcycle.getBrand());
        motorcycle.start();
        motorcycle.stop();
    }
}

