package src;
import java.util.Scanner;

class RightTriangleStarPattern
{

void rightSideAsterisk()
{
	int n;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter your Left triangle rows value");
	n=obj.nextInt();
	
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
	System.out.println();
	
	}
}

}


public class TriangleStarPattern {

	public static void main(String[] args) {
		
		
		RightTriangleStarPattern sc = new RightTriangleStarPattern();
		sc.rightSideAsterisk();
			
	}

}
