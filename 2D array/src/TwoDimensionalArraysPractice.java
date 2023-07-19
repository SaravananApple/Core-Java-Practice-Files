import java.util.Scanner;
class TwoDimensionalArraysPractice
{
public static void main(String[] args)
{
int[][] a = new int[4][4];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value");

for(int r=0;r<4;r++)
{
for(int c=0;c<4;c++)
{
a[r][c] = sc.nextInt();
}
}

for(int r=0;r<4;r++)
{
for(int c=0;c<4;c++)
{
System.out.print(a[r][c]+" ");
}
System.out.println();
}

}
}