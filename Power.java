/*To find out the power of a number*/
class Power{
	public static void main(String as[])
	{
		int base=2;
		int exponent=3;
		int product=1;
		while(exponent>0)
		{
			product=product*base;
			exponent--;
		}
		System.out.println(product);
	}
}
		