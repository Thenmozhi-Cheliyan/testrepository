package thenmozhi;
import java.util.*;
public class pgm211 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,exp;
		System.out.print("a= ");
		a=s.nextInt();
		System.out.print("b=" );
		b=s.nextInt();
		
		System.out.println("**********OPTIONS**************");
		System.out.println("(1) ++a-b--");
		System.out.println("(2) a%b++");
		System.out.println("(3) a*=b+5");
		System.out.println("(4) x=69>>>2");
		System.out.println("*******************************");
		
		System.out.println("Enter your choice:");
		exp=s.nextInt();
		
		
		switch(exp)
		{
		case 1:
			System.out.print("++a-b-- = "+(++a-b--));
		break;
		case 2:
			System.out.print("a%b++ = "+(a%b++));
		break;
		case 3:
			System.out.print("a*b+5 = "+(a*b+5));
			break;
		case 4:
		    int x=69>>>2;
			System.out.print("x= "+Integer.toBinaryString(x));
			break;
		}
				
		}
		
	}


