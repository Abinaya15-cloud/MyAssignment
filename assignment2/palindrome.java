package assignment2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int input = 121;  
		        int output = 0;

		       		        for (int i = input; i > 0; i = i / 10) {
		            output = (output * 10) + (i % 10);  
		        }

		       
		        if (input == output) {
		            System.out.println(input + " is a Palindrome");
		        } else {
		            System.out.println(input + " is NOT a Palindrome");
		        }
	}
}
			

