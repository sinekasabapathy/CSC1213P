class EX05
{
	public static void main(String args[])
	{
		int marks[][]={{54,02,45},{67,54,87},{76,46,89},{9,10,65}};
		
		for(int i=0;i<4;i++)
		{
			int max=marks[i][0];
			for(int j=0;j<3;j++)
			{
				if(max<marks[i][j])
				{
					max=marks[i][j];
				}
			}
			System.out.print("The row "+(i+1)+ " Maximum Marks is "+max);
		    System.out.println();
		}
	}
}
			