import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value whhich is want to convert factorial");
  int n = sc.nextInt();
  
  int fact = 1;

  for(int i=1;i<=n;i++)
  {
	  fact = fact*i;
  }
	
	System.out.println("The given value factorial is :"+fact);
	
	}

}
