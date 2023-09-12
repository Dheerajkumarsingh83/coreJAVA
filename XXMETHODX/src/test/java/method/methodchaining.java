package method;

public class methodchaining {
    private int value;
    
    public methodchaining setValue(int value) {
        this.value = value;
        return this;
    }
    
    public methodchaining increment() {
        value++;
        return this;
    }
    
    public int getValue() {
        return value;
    }
    
    public static void main(String[] args) {
        methodchaining example = new methodchaining();
        int result = example.setValue(5).increment().getValue();
        System.out.println("Result: " + result); // Result: 6
    }
}