import java.util.Scanner;
class EX12
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner (System.in);
		
		System.out.print("Enter the Number:");
		int a=ob.nextInt();
		
		if(a%5==0 &&  a%11==0)
		{
			System.out.print("The Number "+a+" is divisible by 5 and 11");
		}
		else
		{
			System.out.print("The Number "+a+" is not divisible by 5 and 11");
		}
	}
}
			
		