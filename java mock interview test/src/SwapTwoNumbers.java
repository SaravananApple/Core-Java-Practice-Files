import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a number to swap");
		a = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the b number to swap");
		b = sc1.nextInt();
	
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the c number to swap");
		c = sc2.nextInt();
	
	System.out.println("Given a:"+" "+a+" "+"and"+" "+"b:"+" "+b+" "+"values before swap");
		
	c = a;
	a = b;
	b = c;
	
	System.out.println("Given a:"+" "+a+" "+"and"+" "+"b:"+" "+b+" "+"values after swap");
	
	
	}

}
