class InsertValue
{
	public static void main(String as[])
	{
	int arr[]={1,2,3};
	System.out.println("Given array");
	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
	arr[0]=7;
	System.out.println("After Inserting the value");
	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
	}
}