package UNCHECKEDEXCEPTION;

import java.util.*;
//Main class
public class ArrayIndexOutOfBoundsExceptionHandle{
 
 // Main function
 public static void main (String[] args) {
     try{

         // Definign the array
         int arr[] = {1, 2, 3, 4, 5};

         // Printing the array elements. 
         for (int i = 0; i <= arr.length; i++){
             System.out.println("Element at index "+
                     i + " is " + arr[i]);
         }

     } catch (Exception e){
         // Printing the error.
         System.out.println("ERROR");
         e.printStackTrace();
     }
     
     // Remaining program
     System.out.println("Other Statements");
     /*
      * .....................
      * .....................
      * .....................
      * .....................
     */
 }
}