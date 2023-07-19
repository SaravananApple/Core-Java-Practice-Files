import java.util.Scanner;
class ArraysIncrement
{
public static void main(String[] args)
{
int a[] = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the arrays value");
int i;
for( i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}

System.out.println("The arrays values are");
for( i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}