import java.util.Scanner;

//Reverse a number using recursion

public class ReverseNumber {

	public static void reverseNumber(int n)
	{
		if(n<10)
		{
			System.out.println(n);//print the same given number if the given value is less than 10
			return;
		}
		else
		{
			System.out.print(n%10);
		    reverseNumber(n/10);
		}
	
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to do reverese");
		int n = sc.nextInt();
		
		reverseNumber(n);

	}

}
