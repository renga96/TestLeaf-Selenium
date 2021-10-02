package week1.day2;

public class LearnWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 9876;
		int quotient = 0, remainder = 0, sum = 0;

		while (number != 0) {
			quotient = number / 10;
			System.out.println("quotient: " + quotient);
			remainder = number % 10;
			System.out.println("remainder: " + remainder);
			sum = sum + remainder;
			System.out.println("sum: " + sum);
			number= quotient;
			
		}
		System.out.println("Total Sum: " + sum);
	}

}
