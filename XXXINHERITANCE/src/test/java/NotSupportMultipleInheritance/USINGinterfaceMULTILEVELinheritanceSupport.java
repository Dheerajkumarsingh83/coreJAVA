package NotSupportMultipleInheritance;

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Implementation of method1");
    }

    public void method2() {
        System.out.println("Implementation of method2");
    }
}

public class USINGinterfaceMULTILEVELinheritanceSupport {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1(); // Call method1 from Interface1
        myClass.method2(); // Call method2 from Interface2
    }
}
