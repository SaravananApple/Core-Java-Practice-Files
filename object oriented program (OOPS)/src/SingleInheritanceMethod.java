import java.util.*;
class SingleInheritanceMethod
{
void add()
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the a Value");
System.out.println();
a=sc.nextInt();
System.out.println("Enter the b Value");
b=sc.nextInt();
c=a+b;
System.out.println("Addition:"+c);
}
public static void main(String[] args)
{

SingleInheritanceMethod obj = new SingleInheritanceMethod();

obj.add();
}
}