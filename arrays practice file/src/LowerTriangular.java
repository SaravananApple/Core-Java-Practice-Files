import java.util.Scanner;
class LowerTriangular
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the row array size");
int n;
n = sc.nextInt();
Scanner sd = new Scanner(System.in);
System.out.println("Enter the column array size");
int m;
m = sc.nextInt();
int a[][] = new int[n][m];


if(n==m)
{

System.out.println("Enter your value for array");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
Scanner ss = new Scanner(System.in);
a[i][j]=ss.nextInt();
}
}



System.out.println("You have entered value is:");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{

System.out.print(a[i][j]+" ");
}
System.out.println();
}

System.out.println("The lower traingular Matrix is:");










for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{

if(i>=j)
{
System.out.print(a[i][j]+" ");
}
else
{
System.out.print("0"+" ");
}
}
System.out.println();
}
}


else
{
System.out.println("You have entered improper value");
}

















}
}