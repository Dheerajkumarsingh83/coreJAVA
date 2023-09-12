package ConcreteClass;

public class MainRectangle {
    public static void main(String[] args) {
    	Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.calculateArea());

        rectangle.setWidth(8);
        rectangle.setHeight(10);
        System.out.println("New Width: " + rectangle.getWidth());
        System.out.println("New Height: " + rectangle.getHeight());
        System.out.println("New Area: " + rectangle.calculateArea());
    }
}