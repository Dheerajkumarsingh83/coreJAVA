package INNERClass;

public class OuterClass {
    private int x;

    public void outerMethod() {
        InnerClass innerObj = new InnerClass();
        innerObj.innerMethod();
    }

    public class InnerClass {
        public void innerMethod() {
            x = 10; // Accessing the outer class member
            System.out.println("Value of x in InnerClass: " + x);
        }
    }
}


