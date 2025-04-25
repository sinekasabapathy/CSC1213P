class EX03
{
	public static void main(String args[])
	{
		int marks[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(marks[i][j]+" ");
				sum=sum+marks[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of all element in the array is "+sum);
	}
}
		
			