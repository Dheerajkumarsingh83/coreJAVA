package THISKEYWORD;

//Return Current Object from a Method

class ReturnCurrentObjectMethod
{
	public void getName()
	{
	 System.out.println("Studytonight");
	}

	public ReturnCurrentObjectMethod display()
	{
	 // return current object
	 return this;
	}
	
	public static void main(String[] args) {
		ReturnCurrentObjectMethod d = new ReturnCurrentObjectMethod();
		ReturnCurrentObjectMethod d1 = d.display();
		d1.getName();
	}
}