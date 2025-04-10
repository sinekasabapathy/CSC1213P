import java.util.Scanner;
class EX03
{
	public static void main(String []args)
	{
		Scanner ob=new Scanner(System.in);
		int num[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the number:");
			num[i]=ob.nextInt();
			
		}
		
		int max=num[0];
		int min=num[0];
		
		for(int i=0;i<5;i++)
		{
			if(max < num[i])
			{
				max=num[i];
			}
			
			if(min > num[i])
			{
				min=num[i];
			}
		}
		System.out.println("The Largest number is "+max);
		System.out.println("The Smallest number is "+min);
	}
}
		
			
			
		
		