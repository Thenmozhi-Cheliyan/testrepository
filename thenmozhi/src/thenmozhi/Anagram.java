package thenmozhi;
import java.util.*;
public class Anagram
{
	public static void main(String[] args) 
	{		
		String str1,str2;
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("String 1= ");
		str1=s.next();
		System.out.println("String 2= ");
		str2=s.next();
		if(str1.length()==str2.length())
		{
			for(i=0;i<str1.length();i++)
			{
				for(j=0;j<str2.length();j++)
				{
					if(str1.charAt(i)==str2.charAt(j))
					{
							str2 = str2.substring(0, j) + str2.substring(j + 1);
							break;
					}
				}
			}
			if(str2.length()==0)
			{
				System.out.println("Anagram");	
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
		else
		{
			System.out.println("The length is not same...so it cannot be a anagram");
		}
	}
}

		

	


