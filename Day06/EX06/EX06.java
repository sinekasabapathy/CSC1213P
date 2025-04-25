import java.util.Scanner;
class EX06
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter the row size of array:");
		int size =sc.nextInt();
		
		System.out.print("Enter the column size of array:");
		int size1 =sc.nextInt();
		
		int array[][]=new int[size][size1];
		
		System.out.println("Enter the element of array:");
		for(int i=0;i<size;i++)
		{	
			for(int j=0;j<size1;j++)
			{
			System.out.print("Element["+i+"]["+j+"]: ");
			array[i][j]=sc.nextInt();
			}
		}
		System.out.println();	
		
		
		int sum=0;
		for(int i=0;i<size;i++)
		{	
			for(int j=0;j<size1;j++)
			{
			System.out.print(array[i][j]+" ");
			sum=sum+array[i][j];
			}
		System.out.println();	
		}
		System.out.println();
		System.out.println("The sum of all the element:"+sum);
		
		int min=array[0][0];
		int max=array[0][0];
		for(int i=0;i<size;i++)
		{	
			for(int j=0;j<size1;j++)
			{
				if(max<array[i][j])
				{
					max=array[i][j];
				}
				if(min>array[i][j])
				{
					min=array[i][j];
				}
			}
		}
		System.out.println("The max element in the array:"+max);
		System.out.println("The min element in the array:"+min);
		
		
		
	}
}

		
				
				
		
		
		
		