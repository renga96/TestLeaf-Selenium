package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] charArr = test.toCharArray();
		System.out.println("The Given String= "+test);

		for (int i = 0; i < charArr.length; i++) {
			if (i % 2 != 0) {
				char upperCase = Character.toUpperCase(charArr[i]);
				System.out.print(upperCase);

			} else {
				System.out.print(charArr[i]);
			}

		}

	}

}
