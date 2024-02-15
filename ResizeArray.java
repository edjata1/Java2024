// Resize array
public class ResizeArray {

	// Resize Method
	public static int[] ResizeArray(int[] arr, int capacity) {
		// create array with capacity as size
		int[] temp = new int[capacity];
		// copy all elements of array to temp
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		// arr = temp;
		// return arr;
		// return array with new size and elements
		return temp;
	}

	// Print array method
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// Main method
	public static void main(String[] args) {
		// Create array
		int[] arr = new int[]{2, 3, 5, 7};
		
		System.out.println("Original size: " + arr.length);
		
		// Store the resize array back in original
		arr = ResizeArray(arr, arr.length * 3);
		System.out.println("Resize original size: " + arr.length);
		
		printArray(arr);
	}

}
