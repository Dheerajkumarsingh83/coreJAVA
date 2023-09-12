package FinalKeyword;

public class FinalObject
{
	public static void main(String[] args)
	{
		final Student s = new Student("Justin");
		s.setName("Justin Greene");//Modifying final object properties is allowed
		System.out.print("Name of Student: " + s.getName());
	}
}