import java.util.Scanner;
class Arithmetic
{
public static void main(String[] args)
{

Scanner scan = new Scanner(System.in);

int a,b,c;

System.out.println("Enter First Value");
a=scan.nextInt();

System.out.println("Enter First Value");
b=scan.nextInt();

c=a+b;

System.out.println("Addition:"+c);

c=a*b;

System.out.println("Multiplication:"+c);

c=a/b;

System.out.println("Division:"+c);

c=a-b;

System.out.println("Subraction:"+c);

c=a%b;

System.out.println("Module:"+c);

}



}