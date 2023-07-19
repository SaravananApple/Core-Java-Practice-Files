import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the fibonacci series number which is want to convert fibonacci number");
	int n = sc.nextInt();
	
	int n1 = 0,n2 = 1,n3 ;
	
	System.out.print(n1+" "+n2);
	
	for(int i=0; i<n;i++)
	{
		n3 = n1 + n2;
		System.out.print(" "+n3);
		
		n1 = n2;
		n2 = n3;
	}
		
		
		

	}

}
