import java.util.Scanner;
class EX04
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter the Letter:");
		char ch=ob.next().charAt(0);
		
		switch(ch)
		{
			case'a':case'e':case'i':case'o':case'u':
			case'A':case'E':case'I':case'O':case'U':
			
			System.out.print(ch+" is a Vowel");
			break;
			
			default:System.out.print("The letter is not vowel");
		}
	}
}
			
			