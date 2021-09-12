package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 7, 8 };

		Arrays.sort(arr);

		for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] == i) {
				continue;
			}
			System.out.println("The Missing Number is " + i);
			break;

		}
	}

}
