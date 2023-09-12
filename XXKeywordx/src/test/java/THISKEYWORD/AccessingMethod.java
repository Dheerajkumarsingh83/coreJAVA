package THISKEYWORD;

// Accessing Method using this keyword
class AccessingMethod
{
	public void getName()
	{
	 System.out.println("Studytonight");
	}

	public void display()
	{
	 this.getName();
	}
	
	public static void main(String[] args) {
		AccessingMethod d = new AccessingMethod();
		d.display();
	}
}