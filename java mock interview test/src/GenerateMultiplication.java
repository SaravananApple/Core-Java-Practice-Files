import java.util.Scanner;

public class GenerateMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get table for that number");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
		System.out.println(n+" "+"*"+" "+i+" "+"="+" "+n*i);
		}

	}

}
