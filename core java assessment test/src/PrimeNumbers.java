import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get prime number");
		int n = sc.nextInt();
		
 
  
  for(int i=2;i<n;i++)
  {
	  if(n%2==0)
	  {
		  System.out.println("This is not prime number");
		  break;
	  }
	  else
	  {
		  System.out.print(i+" ");
	  }
  }
		
		
		
		
		
		
		
		
		//		if(n==1)
//		{
//			System.out.println(n);
//		}
//		
//		else if(n%2==0)
//		{
//			System.out.println("The entered number is not prime number");
//		}
//	
//		else
//		{
//			System.out.println("The entered number is prime number");
//		}
//	
	
	}
	

}
