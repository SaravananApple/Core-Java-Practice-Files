import java.util.Scanner;
class TwoDimensionalArray
{
public static void main(String[] args)
{
int a[][] = new int[2][2];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value");

for(int r=0;r<2;r++)
{
for(int c=0;c<2;c++)
{
a[r][c]=sc.nextInt();
}
}

for(int r=0;r<2;r++)
{
for(int c=0;c<2;c++)
{
System.out.print(a[r][c]+" ");
}
System.out.println();
}





}
}