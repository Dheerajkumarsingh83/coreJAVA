package ReverseArrayinPlace;

public class UsingXORswapping {
	 public static void reverseArrayInPlace(int[] array) {
	        int start = 0;
	        int end = array.length - 1;

	        while (start < end) {
	            array[start] = array[start] ^ array[end];
	            array[end] = array[start] ^ array[end];
	            array[start] = array[start] ^ array[end];
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        reverseArrayInPlace(array);

	        // Print the reversed array
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
}
