import java.util.Scanner;
class EX02
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter the 1st number:");
		int num1=ob.nextInt();
		
		System.out.print("Enter the 2nd number:");
		int num2=ob.nextInt();
		
		System.out.print("Enter the 3rd number:");
		int num3=ob.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("The 1st number is Maximum");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.print("The 2nd Number is Maximum");
		}
		else
		{
			System.out.print("The 3rd Number is Maximum");
		}
	}
}