package CONSTRUCTOR;

public class ConstructorParameter {
	  int x;

	  public ConstructorParameter(int y) {
	    x = y;
	  }

	  public static void main(String[] args) {
	    ConstructorParameter myObj = new ConstructorParameter(5);
	    System.out.println(myObj.x);
	  }
	}