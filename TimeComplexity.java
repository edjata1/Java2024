// Calculate Time complexity using n natural number formula 1+2+3...n = sum
public class TimeComplexity {

	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		
		TimeComplexity tcDemo1 = new TimeComplexity();
		System.out.println(tcDemo1.findSum(99999));
		
		System.out.println("Method 1: Time taken in " + (System.currentTimeMillis() - now) + " milliseconds");
	
		System.out.println("*************************************");
		
		TimeComplexity tcDemo2 = new TimeComplexity();
		System.out.println(tcDemo2.findSum2(99999));
		
		System.out.println("Method 2: Time taken in " + (System.currentTimeMillis() - now) + " milliseconds");

	
	}

	// Finds sum method 1: calculating n natural number formula 1+2+3...n = sum return formula sum
	public int findSum(int n) {
		return n * (n + 1) / 2;
	}
	
	// Finds sum method 2: calculating n natural number formula 1+2+3...n = sum using loop return sum
	public int findSum2(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
}
