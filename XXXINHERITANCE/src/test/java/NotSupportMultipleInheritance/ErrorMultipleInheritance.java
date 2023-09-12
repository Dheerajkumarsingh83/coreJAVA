package NotSupportMultipleInheritance;

class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
/*public class ErrorMultipleInheritance extends A,B {//suppose if it were A,B not supported in inheritance  
   
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}*/
