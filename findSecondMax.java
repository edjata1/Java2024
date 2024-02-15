// Find second max number in array of integers
public class findSecondMax {

	// Find second max method: loops over array to find the second highest integer
	public static int findSecondMax(int[] arr) {
		// Assigns integer min value to max
		int max = Integer.MIN_VALUE;
		// Assigns integer max value to second max
		int secondMax = Integer.MAX_VALUE;
		// Loops over array
		for(int i = 0; i < arr.length; i++) {
			// Compares values
			if(arr[i] > max) {
				// sets values of max and second max
				secondMax = max;
				max = arr[i];
			}
			// Compares values if second max is not greater than arr[i] AND max is not = to arr[i]
			else if(arr[i] > secondMax && arr[i] != max){
				// Assign second max value of arr[i]
				secondMax = arr[i];
			}
		}
		// Return second max
		return secondMax;
	}
	
	// Print array method: prints each element in array
	public static void printArray(int[] arr) {
		// Loops over array
		for(int i = 0; i < arr.length; i++) {
			// Prints value of each element on same line
			System.out.print(arr[i] + " ");
		}
		// Empty line
		System.out.println();
	}

	// Main Method
	public static void main(String[] args) {
		// Create array and assign values
		int[] arr = {10, 31, 222, 30, 223, 225, 124, 125, 126, 221, 32, 8, 5, 15, 31, 2, 22};
		// Print array
		printArray(arr);
		// Initializing class
		findSecondMax sMax = new findSecondMax();
		// Second max value
		System.out.println(sMax.findSecondMax(arr));
	}
}
