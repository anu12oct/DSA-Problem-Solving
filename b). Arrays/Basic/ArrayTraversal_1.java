package arrayOperations;

public class ArrayTraversal_1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		// To print array elements one by one

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		// To print array elements in single line

		int x;

		for (int j = 0; j < arr.length; j++) {
			x = arr[j];
			System.out.print(x + " ");

		}

		// Printing in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
