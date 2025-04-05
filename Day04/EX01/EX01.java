import java.util.Scanner;

class EX01
{
	public static void main(String args[])
	{
	
	  Scanner ob=new Scanner(System.in);
	  System.out.print("Enter the Number to find the Summation:");
	  int n =ob.nextInt();
	  int i=0;
      int sum=0;
	
	  while(i<=n)
	  {
		sum =sum+i;
		i++;
	  }
	
	System.out.print("Summation of Numbers from 0 t0 "+n+ " :"+sum);
	}
}

