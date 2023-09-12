package method;

public class methodwithreturntype {
	public static void main(String[] args) {
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);
    }
    
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
