package week2.day1;

import java.util.Arrays;

public class Angram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";

		int length1 = text1.length();
		int length2 = text2.length();
		
		if(length1==length2)
		{
			char[] chartext1 = text1.toCharArray();
			char[] chartext2 = text2.toCharArray();
			
			Arrays.sort(chartext1);
			Arrays.sort(chartext2);
			
			text1=String.valueOf(chartext1);
			text2=String.valueOf(chartext2);
			
			System.out.println("The text1 after sort :"+text1);
			System.out.println("The text2 after sort :"+text2);
			
			if(text1.equals(text2)) {
				System.out.println("The Given Strings are Equal and its Anagram");
			}
			else {
				System.out.println("The Given Strings are NOT Equal and its NOT Anagram");
			}
		}else
		{
			System.out.println("Length of the strings are not equal. ");
		}

	}

}
