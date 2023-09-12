package STRING;

import java.util.Arrays;
public class Javastringconvertedintobytearray 
{
   public static void main(String[] args)         
   {
      String str = "Scaler";
 byte[] byteArray = str.getBytes();
  // print the byte[] elements
     System.out.println("String to byte array: " + Arrays.toString(byteArray));
   }
}