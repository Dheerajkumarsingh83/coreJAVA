package CONSTRUCTOR;

public class ConstructorManyParameter {
	  int modelYear;
	  String modelName;

	  public ConstructorManyParameter(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
	    ConstructorManyParameter myCar = new ConstructorManyParameter(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
	}