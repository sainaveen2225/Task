/*Write the primnumbers between the given numbers*/
class Primenumber
{
public static void main(String as[])
{
	int i,j,count,total=0,sum=0;
	for(i=15;i<=30;i++)
	{
		count=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			count++;
		}
		if(count==2)
		{
			System.out.println(i);
			total=total+1;
			sum=sum+i;
		}
	}	
	System.out.println("Total prime numers is=" +total);
	System.out.println("Total prime numbers sum is=" +sum);
}
}