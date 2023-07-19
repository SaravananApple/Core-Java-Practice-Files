import java.util.Scanner;

public class GreatestNumbersOfTwoValues {

	public static void main(String[] args) {
		int a,b;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the a value");
		a = sc.nextInt();

	
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the b value");
		b = sc1.nextInt();
	
	if(a==b)
	{
		System.out.println("The given both values are equal");
	}
	if(a>b)
	{
		System.out.println("The entered two given value a is greater than b:");
	}
	else
	{
		System.out.println("The entered two given value b is greater than a:");	
	}
	
	
	}

}
