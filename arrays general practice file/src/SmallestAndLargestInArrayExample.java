import java.util.Scanner;
class SmallestAndLargestInArrayExample
{
public static void main(String[] args)
{
int a[] = new int[3];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value");



for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}

int largest = a[0];
int smallest = a[0];

for(int i=1;i<a.length;i++)
{
if(a[i]>largest)
{
largest=a[i];
}
else if(a[i]<smallest)
{
smallest = a[i];
} 



}

System.out.println("This is largest value of your number"+" "+largest);
System.out.println("This is smallest value of your number"+" "+smallest);


}
}