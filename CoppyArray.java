class CopyArray
{
	public static void main(String args[])
	{
		int arr1[]={1,2,3,};
		System.out.println("Given array is");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	
		int arr2[]=new int[arr1.length];

		int i=0;
		while(i<arr1.length)
		{
			arr2[i]=arr1[i];
			i++;
		}
		System.out.println("copied array is");
		for(int j=0;j<arr2.length;j++)
		{
		System.out.println(arr2[j]+" ");
		}
	}	
}


	
	

