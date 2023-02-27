/*Write a Java program to take an array and count positive, negative, and zero in the given array. Display the count values.*/
class PositiveNegativeZero
{
	public static void main(String args[])
	{
		int arr[]={-2,-1,0,1,2,3};
		int positiveCount=0,negativeCount=0,zeroCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
			positiveCount=positiveCount+1;
			}
			else if(arr[i]<0)
			{
			negativeCount=negativeCount+1;
			}
			else
			zeroCount=zeroCount+1;
		}
			System.out.println("Count of Positive numbers are "+positiveCount);	
			System.out.println("Count of Negative numbers are "+negativeCount);
			System.out.println("Count of Zeros  "+zeroCount);	
	}
}
		