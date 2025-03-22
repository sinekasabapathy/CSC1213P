import java.util.Scanner;
class EX04
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		
		//Bolean 
		System.out.println("Input the value:");
		boolean val01=ob.nextBoolean();
		System.out.println("Output:"+val01);
		
		//Byte 
		System.out.println("Input the value:");
		byte val02=ob.nextByte();
		System.out.println("Output:"+val02);
		
		//Short
		System.out.println("Input the value:");
		short val03=ob.nextShort();
		System.out.println("Output:"+val03);
		
		//Integer 
		System.out.println("Input the value:");
		int val04=ob.nextInt();
		System.out.println("Output:"+val04);
		
		//Float
		System.out.println("Input the value:");
		float val05=ob.nextFloat();
		System.out.println("Output:"+val05);
		
		//Double 
		System.out.println("Input the value:");
		double val06=ob.nextDouble();
		System.out.println("Output:"+val06);
		
		//Long 
		System.out.println("Input the value:");
		long val07=ob.nextLong();
		System.out.println("Output:"+val07);
	}
}