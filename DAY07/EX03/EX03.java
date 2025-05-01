public class EX03
{
	static int square(int num)
	{
		return num*num;
	}
	public static void main(String [] args)
	{
		//square(4);
		int result=square(4);
		System.out.println("square:"+result);
		System.out.println("square:"+square(5));
	}
}