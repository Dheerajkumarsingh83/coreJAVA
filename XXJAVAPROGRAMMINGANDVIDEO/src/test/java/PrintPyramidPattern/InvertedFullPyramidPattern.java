package PrintPyramidPattern;

public class InvertedFullPyramidPattern {
	public static void printInvertedFullPyramid(int rows) {
        int spaces = 0;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            spaces++;

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        printInvertedFullPyramid(rows);
    }
}
