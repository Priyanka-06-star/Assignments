package week1.day2;


public class IsPrime {

	public static void main(String[] args) {
        int n = 50; // Example: find prime numbers up to 49 (n-1)
        System.out.println("Prime numbers from 2 to " + (n - 1) + ":");
        for (int i = 2; i < n; i++) { // Iterate from 2 to limit-1
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        }

   
        // For a new line after printing all primes
    

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) { // Numbers less than or equal to 1 are not prime
            return false;
        }
        // Check for divisibility from 2 up to the square root of num
        for (int j = 2; j * j <= num; j++) {
        	if(num%j==0) {
        		return false;
        	}
        	break;
        }
		return true;
    }
}