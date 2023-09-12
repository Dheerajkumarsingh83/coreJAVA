package STRING;
//What is the difference between str1 == str2 and str1.equals(str2)?
public class StringComparison
{
   public static void main(String[] args)
   {
       String str1=new String("Scaler"); 
       String str2=new String("Scaler");    
       System.out.println(str1 == str2);  
       System.out.println(str1.equals(str2));
   }
}
