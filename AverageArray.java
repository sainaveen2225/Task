/*Write an array program in Java to find the average of an array and numbers greater than the average in an array*/
class AverageArray
{
	public static void main(String as[])
	{
		int arr[]={1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
			int avg=sum/arr.length;
			System.out.println("Average of an given array ="+avg);
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>avg)
			System.out.println("Numbers greater than the average are "+arr[j]);	
		}	
		
	}

	
}
	