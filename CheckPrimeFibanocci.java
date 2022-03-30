package anagrams;
public class CheckPrimeFibanocci
{

	public static void main(String[] args)
	{
		int i,n1,n2,n3;
		n1=0;
		n2=1;
		int temp,j;
		//System.out.print(n1+" "+n2);
		for(i=2;i<10;i++)
		{
			n3=n1+n2;
			//System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			temp=n3;
			int count=0;
			for(j=1;j<=temp;j++)
			{
				if(temp%j==0)
				{
					count=count+1;
					if(count>2)
					break;
				}
				if(count==2)
				{
					System.out.print(" "+temp);
				}
			}			
			
		}
	}
}

