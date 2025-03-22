import java.util.Scanner;
class EX03
{
	public static void main(String[] args)
	{
		String fname;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your FirstName:");
		fname=sc.nextLine();
		
		System.out.print("Enter Your Lastname:");
		String lname =sc.next();
		
		System.out.print("Enter Your Age:");
		int age=sc.nextInt();
		
		System.out.print("Enter Your Registration Number:");
		String reg=sc.next();
		
		System.out.print("Sex (M/F):");
		char sex=sc.next().charAt(0);
		
		System.out.print("Enter Your Mobile Number:");
		long mob=sc.nextLong();
		
		System.out.print("Enter Your GPA:");
		double gpa=sc.nextDouble();
		
		System.out.println();
		System.out.println("Fullname:"+fname+" "+lname+"\n"+"Age is:"+age+"\n"+"Reg no:"+reg+"\n"+"Sex:"+sex+"\n"+"Moblie number:"+mob+"\n"+"GPA is:"+gpa);
	}
}
