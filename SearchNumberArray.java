/*Write an array program to search a given number is present in an array or not, if present print the index of the number*/
class SearchNumberArray
{
	public static void main(String as[])
	{
	int arr[]={1,2,3};
	int searchnumber=4;int index=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==searchnumber)
		{
		index=arr[i];
		System.out.println("The given number is present in the array\nThe index of the number is "+(arr[i]-1));
		}
	}
		if(searchnumber!=index)
		System.out.print("Searchnumber is not present in the array");
	}
}