import java.util.Arrays;
class AnagramTwoStrings
{
	public static void main(String args[])
	{
	String s1="ciNema";
	String s2="ice man";
	s1=s1.replaceAll(" ","");
	s2=s2.replaceAll(" ","");
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
		{
		System.out.println("Strings are Not anagram");
		}
		else
		{
		char[]String1=s1.toCharArray();
		char[]String2=s2.toCharArray();
		Arrays.sort(String1);
		Arrays.sort(String2);
		/*System.out.println(Arrays.toString(String1));*/
		/*System.out.println(Arrays.toString(String2));*/
			if(Arrays.equals(String1,String2))
			{
			System.out.println("Two Strings are Angram");
			}
			  else{
			System.out.println("Two Strings are Not Angram");}
		}
	}
}
			