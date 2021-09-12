package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 153;
		int calculated = 0;
		int remainder;
		int original;

		original = input;

		while (input > 0) {
			remainder = input % 10;
			input = input / 10;
			calculated = (remainder * remainder * remainder) + calculated;
		}
			if (calculated == original) {
				System.out.println("The Calculated Value :" + calculated);
				System.out.println("The Given Number " + original + " is Amstrong Number");

			} else {
				System.out.println("The Calculated Value :" + calculated);
				System.out.println("The Given Number " + original + " is NOT Amstrong Number");

			}

		}

	}


