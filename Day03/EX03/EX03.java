import java.util.Scanner;
class EX03
{
	public static void main(String[]args)
	{
		Scanner ob =new Scanner(System.in);
		System.out.print("Input Number:");
		int day=ob.nextInt();
		
		switch(day)
		{
			case 1:System.out.print("It is Monday");
			       break;	   
		    case 2:System.out.print("It is Tuesday");
			       break;
		    case 3:System.out.print("It is Wednesday");
			       break;
			case 4:System.out.print("It is Thursday");
			       break;
			case 5:System.out.print("It is Friday");
			       break;
			case 6:System.out.print("It is Saturday");
			       break;
			case 7:System.out.print("It is Sunday");
			       break;
			default:System.out.print("Invalid day Range");
		}
	}
}