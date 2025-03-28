import java.util.Scanner;
class EX11
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner (System.in);
		
		System.out.print("Enter the 1st Number:");
		int a=ob.nextInt();
		
		System.out.print("Enter the 2nd Number:");
		int b=ob.nextInt();
		
		if(a>b)
		{
			System.out.print("The 1st Number is Maximum");
		}
		else
		{
			System.out.print("The 2nd Number is Maximum");
		}
	}
}
			