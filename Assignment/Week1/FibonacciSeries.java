package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int range = 8;
		int sum;
		
		for (int i = 0; i < range; i++) 
		{
			sum= a+b;
			a=b;
			b=sum;
			
			System.out.println("The Fibonacci Series is: " + sum);
		}
		

	}

}
