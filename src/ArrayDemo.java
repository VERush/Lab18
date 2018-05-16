import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 8, 9, 23, 0, 45, 2 };

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // Once this array is sorted, it maintains the sort
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 9));
		
		int index = Arrays.binarySearch(arr, 9);
		System.out.println(index);

	}
}
