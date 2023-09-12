package UNCHECKEDEXCEPTION;

public class NumberFormatExceptionHandlingTest {
	   public static void main(String[] args) {
	      try {
	         new NumberFormatExceptionHandlingTest().intParsingMethod();
	      } catch (NumberFormatException e) {
	         System.out.println("We can catch the NumberFormatException");
	      }
	   }
	   public void intParsingMethod() throws NumberFormatException{
	      int x = Integer.parseInt("30k");
	      System.out.println(x);
	   }
	}