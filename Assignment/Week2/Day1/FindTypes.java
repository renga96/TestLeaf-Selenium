package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int lengthString = test.length();
		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] charArr = test.toCharArray();
		int lengthCharArr = charArr.length;

		for (int i = 0; i < charArr.length; i++) {
			if (Character.isLetter(charArr[i]))
				letter++;

			else if (Character.isDigit(charArr[i]))
				num++;

			else if (Character.isSpaceChar(charArr[i]))
				space++;
			else
				specialChar++;

		}
		System.out.println("The Lemngth of String: "+ lengthString);
		System.out.println("The Lemngth of Char Array: "+ lengthCharArr);
		
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("SpecialCharcter: " + specialChar);

	}

}
