import java.util.Scanner;
class EX02
{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		int num[]=new int[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter the number:");
			num[i]=ob.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("The "+(i+1)+" number is "+num[i]);
		}
		System.out.println();
		
		String days[]={"Monday","Tuesday","Wednesday","Thurday","Friday","Sutarday","Sunday"};
		for(String day:days)
		{
			System.out.println(day);
		}
	}
}
			
			