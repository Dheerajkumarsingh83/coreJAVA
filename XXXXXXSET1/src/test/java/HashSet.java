import java.util.LinkedHashSet;
public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it removes the duplicate spaces also
				String str="I am in india";
				str=str.toLowerCase();
				//Create LinkedHashSet of type character   
		        LinkedHashSet<Character> set=new LinkedHashSet<>();   
		        //Add each character of the string into LinkedHashSet   
		        for(int i=0;i<str.length();i++)
		        {
		            set.add(str.charAt(i));   
		        }
		        // print the string after removing duplicate characters   
		        for(Character ch:set)  
		        {
		            System.out.print(ch); 
		        }
	}

}
