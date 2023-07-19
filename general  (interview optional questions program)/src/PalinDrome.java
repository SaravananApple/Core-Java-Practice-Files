import java.util.Scanner;
class PalinDrome
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);

int r,sum,temp;
sum=0;
int n;



System.out.println("Enter the Value");
n=scan.nextInt();

temp = n;

while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)

System.out.println("It is PalinDrome");

else

System.out.println("It's not PalinDrome");

}
}





