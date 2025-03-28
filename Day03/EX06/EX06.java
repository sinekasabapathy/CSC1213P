import java.util.Scanner;
class EX06
{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter The Value for Counter 01:");
		int counter1=ob.nextInt();
		
		System.out.print("Enter The Value for Counter 02:");
		int counter2=ob.nextInt();
		
		for(int i=0;i<counter1;i++)
		{
			System.out.println("Value for i :"+i);
			
			for(int j=0;j<counter2;j++)
			{
				System.out.print("Value for j :"+j+" ");
			}
			System.out.println();
		}
	}
}

