package PrintPyramidPattern;

public class HalfPyramidPattern {

		// TODO Auto-generated method stub
		 public static void printHalfPyramid(int rows) {
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }

		    public static void main(String[] args) {
		        int rows = 5;
		        printHalfPyramid(rows);
	}

}
