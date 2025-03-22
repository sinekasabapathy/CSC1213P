import java.util.Scanner;
class EX09
{
	public static void main(String [] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		double num=ob.nextDouble();
		
		if(num%2==0)
		{
			System.out.println("This is even number");
		}
		else
		{
		System.out.println("This is Odd number");
		}
	}
}	