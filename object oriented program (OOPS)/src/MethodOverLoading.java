import java.util.*;
class MethodOverLoading
{
void add(int a, int b)
{
c=a+b;
System.out.println("Addition:"+c);

}
void add(int a, int b, int c)
{
d=a+b+c;
System.out.println("Addition:"+d);

}
public static void main(String[] args)
{
MethodOverLoading B = new MethodOverLoading();

int a,b,c,d;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value");
a = sc.nextInt();
System.out.println("Enter b value");
b = sc.nextInt();
System.out.println("Enter c value");
c = sc.nextInt();

switch (a,b,c)
{
case 1:
B.add(a,b);
break;

case 2:
B.add(a,b,c);
break;
}
}
}

