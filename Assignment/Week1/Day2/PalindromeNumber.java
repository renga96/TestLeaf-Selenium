package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4554;
		int reverse = 0;
		int originalNum = num;

		while (num > 0) {
			int rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;

		}
		System.out.println("The Reversed Number is : " +  reverse );
		
		if (originalNum==reverse)
			System.out.println(" The Number " +originalNum+ " is a Palindrome Number" );
		else
			System.out.println(" The Number " +originalNum+ " is NOT a Palindrome Number" );
			
	}

}
