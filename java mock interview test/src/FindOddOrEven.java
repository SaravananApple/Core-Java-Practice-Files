import java.util.Scanner;

public class FindOddOrEven {

	public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
    n = sc.nextInt();
	
	
	if(n%2==0)
	{
		System.out.println("The given number is even number");
	}
	else
	{
		System.out.println("The given number is odd number");
	}
	
	
	}

}
