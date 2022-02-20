package thenmozhi;
import java.util.*;


public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n,i,j;
		int total,sum=0;
		int miss;
		System.out.println("Enter n: ");
		n=s.nextInt();
		int arr[]=new int[n];
		
		total=(n*(n+1))/2;
		System.out.println("total="+total);
		
		System.out.println("ENter array elements:");
		for(i=0;i<n-1;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(j=0;j<arr.length-1;j++)
		{
			sum=sum+arr[j];
		}
		
		System.out.println("Sum="+sum);
		
		miss=total-sum;
		
	System.out.println("The missing number is "+miss);
		
		
		
		
		

	}

}
