package FinalKeyword;

class ClassC{
	int a;
	
	ClassC(){
		this.a = 100;
	}

	final void printC()
	{
		System.out.print("Class C or a Subclass of C");
	}
}

class ClassB extends ClassC
{
	int b;
	
	ClassB(){
		super.a = 150;
		this.b = 200;
	}
}
public class FinalMethods
{
	public static void main(String[] args)
	{
		ClassB classB = new ClassB();
		classB.printC();
	}
}