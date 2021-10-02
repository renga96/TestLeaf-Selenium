package week1.day2;

public class JumpingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) 
		{
			if(i%2==0)
			{
				continue;
			}
			else
			{
				System.out.println("The Odd Number is : "+ i);
			}
		}
	}

}
