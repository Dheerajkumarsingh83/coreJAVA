package UNCHECKEDEXCEPTION;

import java.util.*;
//Main class
public class ArrayIndexOutOfBoundsExample{
 
 // Main function
 public static void main (String[] args) {
     // Defining the array.        
     int arr[] = {1, 2, 3, 4, 5};
     
     // Priniting the array elements.
     for (int i = 0; i <= arr.length; i++){
         System.out.println("Element at index " + i + " is " + arr[i]);
     }
 }   
}