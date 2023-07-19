import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value which is want to convert palindrome number");
		int n = sc.nextInt();
        int temp = n,r,sum  = 0;
	
	while(n>0)
	{
		r = n%10;
		sum = (sum*10)+r;
		n = n/10;
	}
	if(temp==sum)
	{
		System.out.println("The entered value is palindrome");
		
	}
	
	else
	{
		System.out.println("The entered value is not palindrome");
	}
	
	}

}
