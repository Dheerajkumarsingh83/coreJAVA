package FinalKeyword;

final class ClassA{
	int a;
	
	ClassA(int x){
		this.a = x;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

public class FinalClass
{
	public static void main(String[] args)
	{
		ClassA classA = new ClassA(10);
		System.out.println("Before: " + classA.getA());
		classA.setA(15);//Allowed
		System.out.println("After: " + classA.getA());
	}
}

/*final class ClassA{
	int a;
	
	ClassA(int x){
		this.a = x;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

class ClassB extends ClassA//Error
{
	//...
}*/
