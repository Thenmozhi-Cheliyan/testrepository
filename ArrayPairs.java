package arraypairs;
import java.util.*;
public class ArrayPairs 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[6];
		int k,i;
		System.out.println("Enter k : ");
		k=s.nextInt();
		System.out.println("Enter the array elements : ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			for(int l=j+1;l<arr.length;l++)
			{
				if((arr[j]+arr[l])%k==0)
				{
					if(j<l)
					count++;
				}
			}
		}
		System.out.println("The number of pairs divisible by "+k+" are "+count);	
	}
}
