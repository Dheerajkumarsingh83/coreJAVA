package CONSTRUCTOR;

public class CreateConstructor {
	  int x;  // Create a class attribute

	  // Create a class constructor for the Main class
	  public CreateConstructor() {
	    x = 5;  // Set the initial value for the class attribute x
	  }

	  public static void main(String[] args) {
	    CreateConstructor myObj = new CreateConstructor(); // Create an object of class Main (This will call the constructor)
	    System.out.println(myObj.x); // Print the value of x
	  }
	}