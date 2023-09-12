package UNCHECKEDEXCEPTION;

public class ArithmeticExceptionDemo
{  
    void division(int a, int b)  
    {  
        // Method for division
        int result = a / b;  
        System.out.println("Division successfull.");  
        System.out.println("Result: " + result);  
    }  
  
    // main method  
    public static void main(String argvs[])  
    {  
        // creating an object of the class ArithmeticException  
        ArithmeticExceptionDemo obj1 = new ArithmeticExceptionDemo(); 
        obj1.division(180,0);  
    }  
}
