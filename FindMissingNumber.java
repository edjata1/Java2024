// Finds the missing number in n natural numbers
public class FindMissingNumber {

	// Find missing number method: calculates sum of all numbers in range, deducts to find missing number
	public static int FindMissingNumber(int[] arr) {
		// Assign n the value of array length plus 1
		int n = arr.length + 1;
		// Sum of 1st n natural numbers formula 1+2+3...n = n
		int sum = n * (n + 1) / 2;	
		// Loop over each element in array
		for(int num : arr) {
			// Deduct each number from sum
			sum = sum - num;
		}
		// Returns the missing number
		return sum;
	}

	// Array demo method: list of numbers in array, run find method and print 
	public void arrayDemo() {
		int[] arr = {1, 3, 6, 8, 2, 4, 7};
		System.out.println(FindMissingNumber(arr));
	}
	
	// Main method: runs program
	public static void main(String[] args) {
		// Call class create object
		FindMissingNumber arrUtil = new FindMissingNumber();
		// Run method on object
		arrUtil.arrayDemo();

	}

}
