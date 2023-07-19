import java.util.Scanner;

public class ThreegreatestValueNumbers {

	public static void main(String[] args) {
	int a,b,c;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the a value");
		a = sc.nextInt();

	
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the b value");
		b = sc1.nextInt();
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter the c value");
		c = sc2.nextInt();
	
	
	
	if(a!=b&&b!=c&&c!=a)
	{
	if(a>b||a>c)
	{
		System.out.println("The entered three given value a is greater than b and c:");
	}
	else if (b>a||b>c)
	{
		System.out.println("The entered three given value b is greater than a and c:");	
	}
	else
	{
		System.out.println("The entered three given value c is greater than a and b:");		
	}
	
	}
	
	else
	{
		if(a==b&&a>c)
		{
			System.out.println("a and b values are equal and a , b is greater than c");
		}
		else if(b==c && b>a )
		{
			System.out.println("b and c values are equal and b,c is greater than a");
		}
		else if (c==a && c>b)
		{
			System.out.println("c and a values are equal and c,a is greater than b");
		}
		else
		{
			System.out.println("The given three values are equlas");
		}
	
	}
	
	
	}

}
