package SingletonClass;

public class SingletonMain {
    public static void main(String[] args) {
        // Get the instance of SingletonClass
        SingletonClass singleton = SingletonClass.getInstance();
        
        // Call methods on the singleton object
        singleton.display();
    }
}

