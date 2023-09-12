package FinalClass;

public final class CIRCLE1 {
    private final double radius;

    public CIRCLE1(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        CIRCLE1 circle = new CIRCLE1(5.0);
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}