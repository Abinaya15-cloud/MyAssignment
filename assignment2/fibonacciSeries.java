package assignment2;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int a = 0;
	        int b = 1;
	        int c;

	        System.out.print("First 8 Fibonacci Numbers: ");

	        // Loop to print first 8 Fibonacci numbers
	        for (int i = 0; i < 8; i++) {
	            System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;
	        }
	    }
	}