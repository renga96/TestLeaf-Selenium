package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		int a = 13;
		boolean flag = false;

		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				flag = true;
				break;
			}
			
		}
		if (!flag) {
			System.out.println("The Number is Prime Number");
		} else {
			System.out.println("The Number is NOT Prime Number");
		}
	}

}
