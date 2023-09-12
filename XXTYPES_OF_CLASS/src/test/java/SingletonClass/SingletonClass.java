package SingletonClass;

public class SingletonClass {
    private static SingletonClass instance;
    
    // Private constructor to prevent instantiation from outside the class
    private SingletonClass() {
    }
    
    // Public method to provide access to the single instance
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
    
    // Other methods of the SingletonClass
    public void display() {
        System.out.println("This is a singleton class.");
    }
}

