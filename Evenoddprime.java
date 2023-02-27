/*To find the given number is even or odd or prime*/
class Evenoddprime
{
	public static void main(String as[])
	{
	int i=7,count=0;
		for(int j=2;j<=i/2;j++)
		{	
			if(i%j==0)
			count++;
			
		}	
			if(count==2){	
				System.out.println("Number given is odd prime");}
			else if(i%2==0)
				System.out.println("Number given is even prime");
			else{	
				System.out.println("Number given is odd");}
	
	}
} 