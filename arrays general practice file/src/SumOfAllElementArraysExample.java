import java.util.Scanner;
class SumOfAllElementArraysExample
{
public static void main(String[] args)
{
int a[] = new int[3];
Scanner sc = new Scanner(System.in);
System.out.println("Enter your values");

for(int i=0;i<a.length;i++)
{
a[i] = sc.nextInt();
}

int sum = 0;

for(int i=0;i<a.length;i++)
{
sum = sum + a[i];
}

System.out.println("The sum of your value is:"+ sum);

}
}