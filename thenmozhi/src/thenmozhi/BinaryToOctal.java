package thenmozhi;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int i=0;
		String octalNumber;
		String binaryValue="";
		
		System.out.print("Octal Number = ");
		octalNumber=s.nextLine();
		s.close();
		
		while(i<octalNumber.length())
		{
			char c=octalNumber.charAt((int)i);
			switch(c)
			{
			case '0':
				binaryValue=binaryValue+"000";
				break;
			case '1':
				binaryValue=binaryValue+"001";
				break;
			case '2':
				binaryValue=binaryValue+"010";
				break;
			case '3':
				binaryValue=binaryValue+"011";
				break;
			case '4':
				binaryValue=binaryValue+"100";
				break;
			case '5':
				binaryValue=binaryValue+"101";
				break;
			case '6':
				binaryValue=binaryValue+"110";
				break;
			case '7':
				binaryValue=binaryValue+"111";
				break;
			default:
				System.out.println("Invalid octal digit "+octalNumber.charAt((int)i));
				break;
			
			}
		i++;
		}
	 System.out.println("Binary value= "+binaryValue);
	 
	 int decval=Integer.parseInt(binaryValue,2);
	 System.out.println("Decimal Equivalent = "+decval);
	 System.out.println("Again converted to Octal");
	 System.out.print("Octal Equivalent = ");
	 System.out.print(Integer.toOctalString(decval));	
	}
}
