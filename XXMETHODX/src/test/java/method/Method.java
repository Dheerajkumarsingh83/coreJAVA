package method;

public class Method {
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
    	Method obj = new Method();
        obj.sayHello(); // Output: Hello, World!
        
        int result = obj.addNumbers(3, 5);
        System.out.println("Sum: " + result); // Output: Sum: 8
    }

}
