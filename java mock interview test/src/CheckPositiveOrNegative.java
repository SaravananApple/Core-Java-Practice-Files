import java.util.Scanner;

public class CheckPositiveOrNegative {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		n = sc.nextInt();

	if(n>0)
	{
		System.out.println("The given number is positive");
	}	
	else if(n<0)
	{
		System.out.println("The give number is negative");
	}
	else
	{
		System.out.println("The give values is zero");
	}
	
	
	
	
	}

}
