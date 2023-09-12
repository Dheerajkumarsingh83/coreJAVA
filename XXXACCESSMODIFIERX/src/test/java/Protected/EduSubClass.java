package Protected;
 
public class EduSubClass extends EduProtected {
    public static void main(String[] args) {
        EduProtected show = new EduProtected();
        // invokes message() from EduProtected class
        show.message("Hello from package2 subclass");
    }
}