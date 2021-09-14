package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "RADAR";
		String reverse = "";

		int length = str1.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + str1.charAt(i);

		}
		System.out.println("The Reversed String is : " + reverse);
		System.out.println("The Given String is : " + str1);

		if (str1.equals(reverse)) {
			System.out.println("The Given String " + str1 + " is a Palindrome");
		} else {
			System.out.println("The Given String " + str1 + " is NOT a Palindrome");
		}

	}

}
