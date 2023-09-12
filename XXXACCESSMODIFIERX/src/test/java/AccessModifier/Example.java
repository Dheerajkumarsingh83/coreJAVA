package AccessModifier;

public class Example {
    public int publicVariable = 10;
    protected int protectedVariable = 20;
    private int privateVariable = 30;
    int defaultVariable = 40;
    
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.publicVariable); // 10
        System.out.println(example.protectedVariable); // 20
        System.out.println(example.privateVariable); // Compilation error
        System.out.println(example.defaultVariable); // 40
    }
}









