// Remove even integers, creates an array without even numbers just odd
public class RemoveEvenInteger {

	// Create array print method
	public static void printArray(int[] arr) {
		int arrayLengthIs = arr.length;
		// Loop over array
		for(int i = 0; i < arrayLengthIs; i++) {
			// Print array on one line
			System.out.print(arr[i] + " ");
		}
	}
	
	// Removes all even numbers
	public static int[] removeEven(int[] arrs1){
		// Variable to count number of odd integers and assign to "oddCount"
		int oddCount = 0;
		// Loop over array using array length
        for(int i = 0; i < arrs1.length; i++){
        	// Check if not (even = 0 ) it's odd
            if(arrs1[i] % 2 != 0){
            	// Increase odd count
                oddCount++;
            }
        }
        
        // Return array of odd integers
        // Use "oddCOunt" value to be "result" array size
        int[] result = new int[oddCount];
        // Index value
        int idx = 0;
        // Compare i value to arrs1 length for loop
        for(int i = 0; i < arrs1.length; i++){
        	// Getting odd values from array
            if(arrs1[i] % 2 != 0){
            	// Assign odd value to index location
                result[idx] = arrs1[i];
                // Increase index
                idx++;
            }
        }
        return result;
    }
	
	// Main method
	public static void main(String[] args) {
		// Create array with objects
		int[] arr = {4, 9, 3, 42, 1, 7, 16, 2, 8, 13};
		printArray(arr);
		int[] results = removeEven(arr);
		System.out.println();
		printArray(results);

	}

}
