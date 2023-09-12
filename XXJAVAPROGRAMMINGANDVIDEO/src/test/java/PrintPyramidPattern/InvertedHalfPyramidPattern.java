package PrintPyramidPattern;

public class InvertedHalfPyramidPattern {
	 public static void printInvertedHalfPyramid(int rows) {
	        for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int rows = 5;
	        printInvertedHalfPyramid(rows);
	    }
}
