/*Write a Java program to find the sum of even and odd numbers in an array. Display the sum value*/
class EvenOddSum
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};        /*int arr[]=new int[5];arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;arr[4]=5;*/
		int count=0,count1=0;
		for(int i=0;i<arr.length;i++)
		{	
			if(arr[i]%2==0){
			count=count+arr[i];}
			else{
			count1=count1+arr[i];}
			
		}	
			System.out.println("Sum of Even numbers="+count);
			System.out.println("Sum of Odd numbers="+count1);		
		
	}
	
}