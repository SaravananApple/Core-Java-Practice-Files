import java.util.Scanner;
class Parent
{
int a,b,c;

}
class child extends Parent
{
void add()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the a Value");
a=sc.nextInt();
System.out.println("Enter the b Value");
b=sc.nextInt();
c=a+b;
}
}
class SingleInheritance
{
public static void main(String[] args)
{

child obj = new child();
obj.add();
System.out.println("Addition:"+obj.c);
}
}