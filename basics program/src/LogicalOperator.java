import java.util.Scanner;
class LogicalOperator
{
public static void main(String[] args)
{

Scanner scan = new Scanner(System.in);

int  a,b,c;

System.out.println("Enter your first value");
a=scan.nextInt();

System.out.println("Enter your second value");
b=scan.nextInt();

System.out.println("Enter your Third  value");
c=scan.nextInt();


if(a>b)
{
System.out.println("a is greatest value of two number");
}
else if(b>c)
{
System.out.println("b is greatest value of two number");
}
else 
{
 System.out.println("c is greatest value of two number");
}

if ((a>b)&&(b<c))
{
System.out.println("Exam Pass");
}
else
{
System.out.println("Exam Fail");
}

if ((a>b)||(b<c))
{
System.out.println("Exam Pass");
}
else
{
System.out.println("Exam Fail");
}


}
}