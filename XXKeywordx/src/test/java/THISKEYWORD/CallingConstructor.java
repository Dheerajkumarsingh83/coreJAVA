package THISKEYWORD;

 //class CallingConstructorusingthiskeyword {

class CallingConstructor
{

CallingConstructor ()
 {
	 // Calling constructor
   this("Studytonight");
 }
 
CallingConstructor(String str){
	 
	 System.out.println(str);
	 
 }
 
 public static void main(String[] args) {
	 CallingConstructor d = new CallingConstructor();
 }
}
