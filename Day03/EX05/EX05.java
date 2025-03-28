import java.util.Scanner;
class EX05
{
	public static void main(String[]args)
	{
		Scanner ob =new Scanner(System.in);
		System.out.print("Enter the Number:");
		int number=ob.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			System.out.print(i+"\t");
		}
	}
}