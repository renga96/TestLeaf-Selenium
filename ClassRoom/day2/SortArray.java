package week1.day2;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = { 34,456,23,1000,1,0};
		
		Arrays.sort(numArr);
		
		for (int i = 0; i < numArr.length; i++) {
			
			System.out.println(numArr[i]);
						
		}
		System.out.println("Largest number: "+ numArr[numArr.length-1]);
		System.out.println("Smallest number: "+ numArr[0]);
	}

}
