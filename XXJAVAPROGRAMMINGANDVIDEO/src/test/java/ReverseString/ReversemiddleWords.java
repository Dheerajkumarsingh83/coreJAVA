package ReverseString;

public class ReversemiddleWords{  
	   
static void printReverse(String s)  
    {  
        // Printing the first word  
        int i1 = 0;  
        for (i1 = 0; i1 < s.length() && s.charAt(i1) != ' '; i1++)  
            System.out.print(s.charAt(i1)) ;  
       
        // Printing the middle words  
        String w = "";  
           
           
        for (; i1 < s.length(); i1++) {  
       
            if (s.charAt(i1) != ' ')  
                w += s.charAt(i1);  
                   
            else {  
                    System.out.print(new StringBuilder(w).  
                                reverse().toString() + " ");  
                    w = "";  
            }  
        }  
       
        // Printing the last word  
        System.out.print(w + " ");  
    }  
       
    public static void main(String args[])  
    {  
        String s = "Hello welcome to JavaTpoint";  
        printReverse(s);  
    }  
    }  