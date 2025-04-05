import java.util.Scanner;
class EX03
{
	public static void main(String []args)
	{
		Scanner ob=new Scanner(System.in);
		char ch=' ';
		int countEven=0;
		int countOdd=0;
		int sumEven=0;
		int sumOdd=0;
		
		do
		{
			System.out.print("Enter the Number to find the Summation:");
	        int n =ob.nextInt();
			System.out.print("Do you Want to Contiune (Y/N) : ");
			ch=ob.next().charAt(0);
			
			if(n%2==0)
			{
				countEven++;
				sumEven=sumEven+n;
			}
			else
			{
				countOdd++;
				sumOdd=sumOdd+n;
			}
		}
		while(ch=='Y'||ch=='y');
		System.out.println("Count the Even Number of User has Entered is :"+countEven);
		System.out.println("Count the Odd Number of User has Entered is :"+countOdd);
        System.out.println("Summation the Even Number of User has Entered is :"+sumEven);
		System.out.println("Summation the Odd Number of User has Entered is :"+sumOdd);			
	}
}
		