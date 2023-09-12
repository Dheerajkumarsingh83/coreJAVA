package Default;

public class Person {
	  String fname = "Dheeraj";
	  String lname = "Singh";
	  String email = "john@doe.com";
	  int age = 24;
	  
	  public static void main(String[] args) {
	    Person myObj = new Person();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
	}

