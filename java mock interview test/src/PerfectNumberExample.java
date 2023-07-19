import java.util.Scanner;

public class PerfectNumberExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for perfect number");
		int n = sc.nextInt();
		
		
	long i = 1;
	long sum = 0;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			sum = sum + i;
		}
		
		i++;
	}
	if(n==sum)	
	{
		System.out.println("Entered value is perfect number");
	}	
	else
	{
		System.out.println("Entered value is not  perfect number");
	}
	
	
	
	}

}
