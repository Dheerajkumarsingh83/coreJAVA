package STRING;

public class ConcatenationString
{
    public static void main(String []args)
    {
       StringBuilder stbu=new StringBuilder();
       //Initial object size
       System.out.println(stbu.capacity());
       String str="Scaler";
       System.out.println(str);
       String str1 = new String("InterviewBit");
       System.out.println(str1);
       str1 += " Articles";         //string update
       System.out.println(str1);
    }
}