import java.util.Scanner;
class EX01
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int a=ob.nextInt();
		
		if(a>0)
		{
			System.out.print("The Number is Positive");
		}
		else if(a<0)
		{
			System.out.print("The number is Negative");
		}
		else
		{
			System.out.print("The Number is zero");
		}
	}
}
		