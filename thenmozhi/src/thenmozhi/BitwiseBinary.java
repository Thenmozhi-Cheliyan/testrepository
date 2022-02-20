package thenmozhi;

import java.util.Scanner;

public class BitwiseBinary
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number1,number2,resultAND,resultOR,resultXOR,lShift,rShift,resultTilde;
		
		Scanner s=new Scanner(System.in);
		System.out.print("NUMBER1 = ");
		number1=s.nextInt();
		System.out.print("NUMBER2 = ");
		number2=s.nextInt();
		System.out.println("Number 1 = "+Integer.toBinaryString(number1));
		System.out.println("Number 2 = "+Integer.toBinaryString(number2));
		System.out.println("***********BITWISE AND*************");
		resultAND=number1&number2;
		System.out.println(+number1+" & "+number2+" = "+Integer.toBinaryString(resultAND));
		System.out.println("***********BITWISE OR*************");
		resultOR=number1|number2;
		System.out.println(+number1+" | "+number2+" = "+Integer.toBinaryString(resultOR));
	
		System.out.println("***********BITWISE XOR*************");
		resultXOR=number1^number2;
		System.out.println(+number1+" ^ "+number2+" = "+Integer.toBinaryString(resultXOR));
		
		System.out.println("***********RIGHT SHIFT OPERATOR****");
		rShift=number1>>number2;
		System.out.println(+number1+" >> "+number2+" = "+Integer.toBinaryString(rShift));
		
		System.out.println("***********LEFT SHIFT OPERATOR*****");
		lShift=number1<<number2;
		System.out.println(+number1+" << "+number2+" = "+Integer.toBinaryString(lShift));
		
		System.out.println("***********TILDE*******************");
		resultTilde=~number1;
		System.out.println("~"+number1+" = "+Integer.toBinaryString(resultTilde));
		
		s.close();

	}

}
