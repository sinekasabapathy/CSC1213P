import java.util.Scanner;
class EX02 
{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		char ch=' ';
		int sum=0;
		
		do
		{
			System.out.print("Enter the number to find the summation:");
			int n=ob.nextInt();
			sum=sum+n;
			System.out.print("Do you want to continue (Y/N) :");
			ch=ob.next().charAt(0);
		}
		while(ch=='Y');
		System.out.print("Summation of Numbers:"+sum);
	}
}
		