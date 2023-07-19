import java.util.Scanner;
class OddEvenInArrayExample
{
public static void main(String[] args)
{
int a[] = new int[10];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value");

for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}

for(int i=0;i<a.length;i++)
{
if(a[i]%2 != 0)
{
System.out.println("These numbers are odd number"+ a[i] + " ");
}
}

for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
System.out.println("These numbers are even number"+ a[i]);
}
}


}
}