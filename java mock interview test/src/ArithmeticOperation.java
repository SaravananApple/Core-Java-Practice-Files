import java.util.Scanner;

class Arithmetic
{

int addition(int a, int b)
{
int c;
c = a+b;
return c;
}
	
int subration(int a, int b)
{
int c;
c = a-b;
return c;
}

int multiplication(int a, int b)
{
int c;
c = a*b;
return c;
}

int division(int a, int b)
{
int c;
c = a+b;
return c;
}

int module(int a, int b)
{
int c;
c = a%b;
return c;
}



}


public class ArithmeticOperation {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		a=sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the second value value");
		b=sc1.nextInt();
	
		Arithmetic plus = new Arithmetic();
	    int additionResult = plus.addition(a,b);
	    int subractionResult = plus.subration(a,b);
	    int multiplicationResult = plus.multiplication(a,b);
	    int divisionResult = plus.division(a,b);
	    int moduleResult = plus.module(a,b);
	    
	 
	  Scanner obj = new Scanner(System.in);
	  System.out.println("Enter Your Choice: 1 - Add, 2 - Sub, 3 - Mul, 4 - Div, 5 - Mod:");
	  int n = obj.nextInt();
	  
	  switch(n)
	  {
	  case 1:
	  System.out.println("The addition values is:"+additionResult);
	  break;
	  
	  case 2:
		  System.out.println("The subraction values is:"+subractionResult);
		  break;
	  
	  case 3:
		  System.out.println("The multiplication values is:"+multiplicationResult);
		  break;
	  
	  case 4:
		  System.out.println("The division values is:"+divisionResult);
		  break;
	  
	  
	  case 5:
		  System.out.println("The module values is:"+moduleResult);
		  break;  
	  
	  }
	
	
	
	
	
	
	}

}
