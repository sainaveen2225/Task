/*To remove all non-alphabetic characters from a given string*/
class RemoveNonAlphabetic
{
	public static void main(String args[])
	{
	String str="sai.?&#,_na@veen$'/)";                                                                                    
	String result=str.replaceAll("[^a-zA-Z0-9]","");                
	System.out.println(result);
	}
}

								
							