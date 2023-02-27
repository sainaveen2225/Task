/*Program to merge two arrays and sort them. display iput and output arrays.*/
import java.util.Arrays;
class MergeArray
{
	public static void main(String args[])
	{
	int arr1[]={3,1,2};
	int arr2[]={7,5,1,6};
	int mergelen=arr1.length+arr2.length;
	int merge[]=new int[mergelen];
	for(int i=0;i<arr1.length;i++)
	{
		merge[i]=arr1[i];
	}
		for(int i=0;i<arr2.length;i++)
		{	
		merge[arr1.length+i]=arr2[i];
		}
		System.out.println("MergedArray");
		for(int i=0;i<merge.length;i++)
		{
		System.out.println(merge[i]);
		}
		Arrays.sort(merge);
		System.out.println("sorted array");
		for(int s:merge)
		System.out.println(s);
	}
}
	

