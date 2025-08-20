package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 0;
		int n1 = 1;
		
		for (int i = 0; i <=7; i++) {
			System.out.println(n);
			int n2 = n+n1;
			n=n1;
			n1=n2;
		
		
		}

	}
}


