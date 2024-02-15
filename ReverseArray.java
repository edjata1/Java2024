// Reverse array elements
public class ReverseArray {

	// Reverse array method: numbersArray, start=0, end=numbersArrayLength-1 (6-1)
	public static void reverseArray(int[] numbers, int start, int end) {
		// Loop over array while start less than end
		// StartPointer = 0 < endPointer = 5
		while(start < end) {
			// Swap values: temp gets numbers[startValue]
			int temp = numbers[start];
			// Swap values: numbers[startValue] gets numbers[endValue]
			numbers[start] = numbers[end];
			// Swap values: numbers[end] gets tempValue
			numbers[end] = temp;
			// Increase start index
			start++;
			// Decrease end index
			end--;
		}
	}
	
	// Print array method: looping over array
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Main method
	public static void main(String[] args) {
		// Create array
		int[] numbersArray = {2, 11, 5, 10, 8, 6, 7};
		// Print numbers array
		printArray(numbersArray);
		// Run reverse method
		reverseArray(numbersArray, 0, numbersArray.length-1);
		// Print numbers array
		printArray(numbersArray);

	}

}
