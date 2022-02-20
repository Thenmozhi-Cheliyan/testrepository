package thenmozhi;
import java.util.*;
public class AnagramInbuilt 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str1,str2;
		boolean result;
		System.out.println("String 1=");
		str1=s.next();
		System.out.println("String 2=");
		str2=s.next();
		if(str1.length()==str2.length())
		{
			char[] s1=str1.toCharArray();
			char[] s2=str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			result=Arrays.equals(s1,s2);
			if(result==true)
			{
			System.out.println("The given strings are anagram");
			}
			else
			{
				System.out.println("The given strings are not anagram");
			}
		}
		else
		{
			System.out.println("The given strings are not anagram");
		}
	}
}
