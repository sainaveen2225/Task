/*remove all punctuvations from a given string*/
class RemovePunctuvation
{
	public static void main(String args[])
	{
	String str="sai.?,_na@veen'/)";                                                                                    /*Input string*/
	String result=str.replaceAll("[.?,_@'/)]","");                   /*String replaceAll(String regEx,String newString) */ /*or you can use "\\p{Punct}" */
	System.out.println(result);
	}
}

								
								/*"\\p{Punct}" this class matches with the  ASCII punctuvation default*/