/**
 * 
 */
package basics;

public class Lab1duplicate {

		public static void main(String[] args) {
			// Write a function that takes a value N and returns the sum of 1 to n
		System.out.println (sum(5));
		
		// Write a function that computes factorial *hint: use recursion, n =n*(n-1)! = n*(n-1)*(n-2)!
				System.out.println(factorial(5));
		   
		
		//Write 3 functions that take an array as a parameter and return the minimum, maximum, average value of that array.
		        int[] numbers = {5, -2, 0, 234, -438, 63};
				System.out.println("Min; " +  findMin(numbers));
				System.out.println("Max; " +  findMax(numbers));
				System.out.println("Avg; " +  findAvg(numbers));
                 }

		public static int findMin (int[] arr) {
			int min = arr[0];
			for (int i = 0; i < arr.length; i++ ) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			return min;
		}
		
		
		public static int findMax (int[] arr) {
			int max = arr[0];
			for (int i = 0; i < arr.length; i ++ ) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
		
		
		public static int findAvg (int[] arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i ++) {
				sum = sum + arr[i];
			}
			int avg = sum/ arr.length;
			return avg;
			}
				
		
		
		
		
		
		public static int sum(int n) {
			  int sum = 0; 
					  for (int i = 0;  i <=n; i++) {
						  sum = sum + i;
					  }
			   return sum;
		   }
		 
		public static int factorial (int n) {
			if (n == 0) { 
				return 0;
			}
			
			if (n == 1) {
				return 1;
			}
			return factorial (n-1) * n; 
				}
		
		
		
	}
