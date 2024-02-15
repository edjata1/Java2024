// Palindrome words like "madam" the same spelling both ways
public class Palindrome {

	// Palindrome method: checking if spelling is same forwards and backwards
	public static boolean isPalindrome(String word) {
		// Convert string into char array
		char[] charArray = word.toCharArray();
		// Starting pointer set  to 0
		int start = 0;
		// Ending pointer word length - 1 for index #
		int end = word.length()-1;
		
		while(start < end) {
			// Check if start and end index doesn't matches, if match ++/-- pointers
			if(charArray[start] != charArray[end]) {
				// Terminate if no match return false
				return false;
			}
			// If match, move pointers
			start++;
			end--;
		}
		// Return as true if palindrome 
		return true;
	}

	// Main method
	public static void main(String[] args) {
		// Create class
		Palindrome pal = new Palindrome();
		
		// Run check and print message
		if(pal.isPalindrome("madam")) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Is not Palindrome");
		}

	}

}
