import java.util.Scanner;
class ArraysDecrement
{
public static void main(String[] args)
{
int a[] = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the arrays value");
int i;
for(i=0;i<=5;i++)
{
a[i] = sc.nextInt();
}
for(i=5;i>=0;i--)
{
System.out.println(a[i]);
}
}
}