import java.util.Scanner;
public class EX01
{
	public static void main(String [] args)
	{
		Scanner ob=new Scanner(System.in);
		int num[]=new int[5];
		int sum=0;
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the number:");
			num[i]=ob.nextInt();
			sum=sum+num[i];
		}
		System.out.print("The summation of the numbers:"+sum);
	}
}
		