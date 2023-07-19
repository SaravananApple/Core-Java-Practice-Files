import java.util.Scanner;
class ArmStrong
{
public static void main(String[] args)
{
int a,n,r,temp,sum=0,count=0;

Scanner scan = new Scanner (System.in);


System.out.println("Enter the value");
n=scan.nextInt();
a=n;
temp=n;



while(a>0)
{
a/=10;
count++;
}

while(n>0)
{
r=n%10;
sum += Math.pow(r,count);
n=n/10;
}
if(temp==sum)
System.out.println("It's an arm strong");
else
System.out.println("It's not an arm strong");
}
}   