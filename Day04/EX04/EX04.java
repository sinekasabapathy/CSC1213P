class EX04
{
	public static void main(String[]args)
	{
		int numbers[]=new int[10];
		numbers[0]=24;
		numbers[1]=67;
		numbers[2]=89;
		numbers[3]=78;
		numbers[4]=55;
		numbers[5]=34;
		numbers[6]=89;
		numbers[7]=32;
		numbers[8]=12;
		numbers[9]=39;
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]+"\t");
		}
		
		System.out.println("******************************************************");
		
		int number2[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<number2.length;i++)
		{
			System.out.println(number2[i]+"\t");
		}
		
		System.out.println("******************************************************");
		
		String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Sutarday","Sunday"};
		for(String day:days)
		{
			System.out.println(day+"\t");
		}
	}
}
		