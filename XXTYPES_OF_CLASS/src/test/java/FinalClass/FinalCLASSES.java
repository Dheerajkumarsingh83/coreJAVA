package FinalClass;

public final class FinalCLASSES {
    private final String name;

    public FinalCLASSES(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("FinalClass name: " + name);
    }
    public static class CALLFINALCLASS {
        public static void main(String[] args) {
        	FinalCLASSES finalObj = new FinalCLASSES("Example");
            finalObj.display();
        }
    }
}
