package week1.day1;

public class CheckDivisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Divisibe by 3 and 5");
		} else if (num % 5 == 0) {
			System.out.println("Divisible by 5");
		} else if (num % 3 == 0) {
			System.out.println("Divisibe by 3");
		}
		else
		{
			System.out.println("Not divisible by 3 and 5");
		}

	}

}
