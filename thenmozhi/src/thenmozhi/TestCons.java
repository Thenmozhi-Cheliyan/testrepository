package thenmozhi;
public class TestCons 
{
	int a,b,sum;
	TestCons()	//Default Constructor
	{
		System.out.println("Program for Sample constructor");
		System.out.println("Its a Default Constructor");
	}
	TestCons(int num1,int num2)		//Parameterized constructor
	{
		a=num1;
		b=num2;
		sum=a+b;	
	}
	 void display()
	{
		System.out.println("The sum = "+sum);
	}
	public static void main(String[] args)
	{
		TestCons tc1=new TestCons();
		TestCons tc2=new TestCons(20,30);
		tc2.display();
	}
}
