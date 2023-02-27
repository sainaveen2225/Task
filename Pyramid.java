/*Pyramid structure by astricksymbol*/
class Pyramid
{
	public static void main(String as[])
	{
		int n=5,i,j,s;
		for(i=1;i<=5;i++)
		{
			for(s=1;s<5-i;s++)
			System.out.print(" ");
			for(j=1;j<=(2*i-1);j++)
			System.out.print("*");
			System.out.println("");
		}
	}
}