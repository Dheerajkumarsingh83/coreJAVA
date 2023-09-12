package FinalKeyword;

public class FinalArgumentsorParameters {
	public static void someMethod(final int num)
	{
		num = 10;//Error
		//...
	}
	public static void main(String[] args)
	{
		someMethod(10);
	}
}
