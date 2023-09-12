package FinalKeyword;

//public class Final Reference Variables {

class Student
{
	String name;
	
	Student(String s){
		this.name= s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class FinalReferenceVariables
{
	public static void main(String[] args)
	{
		final Student student = new Student("Justin");
		student = new Student("Jessica");//Error because of reassignment
	}
}
