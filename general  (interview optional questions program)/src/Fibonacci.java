import java.util.Scanner;
class Fibonacci
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int n1=0,n2=1,n3,count=5;

System.out.println("Enter the value");
n3=scan.nextInt();

for(int i=1;i<count;i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}