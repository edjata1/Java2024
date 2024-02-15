// Finds the minimum value in array using to methods 1st find and 2nd print
public class FindMinimumValue {

	// Find min method: loops over the array checking for the smallest value
	public static int findMinimumValue(int[] arr) {
		// Edge
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid input");
		}
		// Holds min value: sets min to arr[index #'s Value] contained
		int min = arr[0];
		// Loops over array (length-1) using < while true enter loop
		for(int i = 1; i < arr.length; i++) {
			// If true, change min value
			if(arr[i] < min) {
				// Min is changed to array[i] value
				min = arr[i];
			}
		}
		// Return min value when loop ends
		return min;
	}

	// Print method: loops over each element in array 
	public static void printArray(int[] arr) {
		// Continue looping while i is less than arr length
		for(int i = 0; i < arr.length; i++) {
			// Print each element of array on same line
			System.out.print(arr[i] + " ");
		}
		// Empty line
		System.out.println();
	}
	// Main method:
	public static void main(String[] args) {
		// Create array
		int[] arr = {5, 23, 4, 29, 3, -1, 1,-20};
		// Initializing class
		FindMinimumValue minArr = new FindMinimumValue();
		
		// Print array
		printArray(arr);
		
		// Call findMinimumValue method and print
		System.out.println(minArr.findMinimumValue(arr));
			
	}
}
