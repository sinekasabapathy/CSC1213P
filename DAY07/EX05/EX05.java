public class EX05
{
	static int sum(int a, int b)
	{
		return a+b;
	}
	static double sum(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		int intResult=sum(4,5);
		double doubleResult=sum(3.5,4.5);
		
		System.out.println("sum(int):"+intResult);
		System.out.println("Sum(double):"+doubleResult);
	}
}