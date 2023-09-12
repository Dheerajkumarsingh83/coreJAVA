package ReverseArrayinPlace;

public class Usingforloop {
	public static void reverseArrayInPlace(int[] array) {
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
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