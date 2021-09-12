package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -40;

		if (a < 0) {
			System.out.println("The Number is Negative Number");
		} else {
			System.out.println("The Number is Positve Number");
		}

		int b = -1 * a;
		System.out.println("The Number " + a + " is converted to: " + b);
	}

}
