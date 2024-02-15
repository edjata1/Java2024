// Move all zeros to end of array
public class moveZeros {

	// Move zeros method: move elements to end of array
	public static int[] moveZeros(int[] arr, int n) {
		// j for Zero elements, i for non-Zero elements
		int j = 0;
		// int n = arr.length;
		
		// Traverse array while i is less than n continue loop TRUE
		for(int i = 0; i < n; i++) {
			
			// Check if BOTH are true (i = non-Zero and j = Zero)
			if(arr[i] != 0 && arr[j] == 0) {
				// Swap values: temp gets arr[i] value
				int temp = arr[i];
				// Swap values: arr[i] gets arr[j] 
				arr[i] = arr[j];
				// Swap values: arr[j] gets temp value 
				arr[j] = temp;
			}
			// Increase pointer location if (j is non-Zero) & stay if j is 0 for swap
			if(arr[j] != 0) {
				// Increase j's index number
				j++;
			}
		}
		// Return array with only zeros moved 
		return arr;
	}

	// Print array elements method
	public static void printArray(int[] arr) {
		// Loop over array length
		for(int i = 0; i < arr.length; i++) {
			// Print array
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// Array demo method: prints each element of array
	public void arrayDemo() {
		// Create array
		int[] arr = {6, 0, 02, 3, 00, 4, 8, 16, 0};
		// Print array
		printArray(arr);
		// Call method to move zeros and print
		printArray(moveZeros(arr, arr.length));
	}
	
	//Main method
	public static void main(String[] args) {
		// Call class
		moveZeros arrUtil = new moveZeros();
		// Call method
		arrUtil.arrayDemo();
		
	}

}
