package revisionprogram;

public class recursivemethod {
public static long factorialrecursive(int n) {
	if(n == 0)
		return 1;
	{
		return n * factorialrecursive(n - 1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 2;
long factorial = factorialrecursive(n);
System.out.println("factorial no" + n + " is :" +factorial);
	}

}
