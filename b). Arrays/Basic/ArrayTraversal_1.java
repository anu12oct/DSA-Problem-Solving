package arrayOperations;

public class ArrayTraversal_1 {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 8, 9, 1 };

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

	}

}
