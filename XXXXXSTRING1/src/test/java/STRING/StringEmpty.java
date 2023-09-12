package STRING;

public class StringEmpty
{  
   // Function to determine if String is empty
   public static boolean isStringEmpty(String str)
   {  
       //Use the isEmpty() method 
       //to determine if the string is empty.
       if (str.isEmpty())
           return true;
       else
          return false;
   }
   public static void main(String args[])
   {  
       String str1="InterviewBit";     //non-empty string
       String str2="";                 //empty string
       System.out.println("Str1 \"" + str1 + "\" is empty? " + isStringEmpty(str1));
       System.out.println("Str2 \"" + str2 + "\" is empty? " + isStringEmpty(str2));
  }
}
