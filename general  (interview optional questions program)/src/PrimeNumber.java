import java.util.Scanner;
class PrimeNumber
{
public static void main(String[] args)
{
int n, flag=0;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the value");
n = sc.nextInt();
int m=n/2;


if(n==0||n==1)
{
System.out.println("It is a prime number");
}
else
{
for (int i=0;i<=m;i++)
{
if(n%1==0)
{
System.out.println("It is not a prime number");
flag = 1;
break;
}
}
}
if(flag==0)
{
System.out.println("It is  a prime number");

}
}
}