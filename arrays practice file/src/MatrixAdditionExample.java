import java.util.Scanner;

public class MatrixAdditionExample {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int i[][] = new int[3][3];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value");
		
		for(int r=0;r<a.length;r++)
		{
		for(int c=0;c<a.length;c++)
		{
			a[r][c] = obj.nextInt();
		}
		}
		
		for(int r=0;r<a.length;r++)
		{
		for(int c=0;c<a.length;c++)
		{
			b[r][c] = obj.nextInt();
		}
		}
	
		for(int r=0;r<a.length;r++)
		{
		for(int c=0;c<a.length;c++)
		{
			i[r][c] = a[r][c] + b[r][c];
		
			System.out.print(i[r][c]+ " ");
			
		}
		 System.out.println();
		}
	
	
	
	
	}

}
