import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to get sum of natural numbers");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<=n;i++)
		{
			sum = sum + i;
			
		}
		
		System.out.println("The given sum of natural number value is:"+" "+sum);
		

	}

}
