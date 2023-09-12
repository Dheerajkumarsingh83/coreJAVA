package FinalKeyword;

public class FinalArrayObject {

	final int[] intArr = {1, 2, 3};
	int Arr = new int[5]; //Error as reassignment is not allowed
	intArr[1] = 10; //Allowed
}
}
