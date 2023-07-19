import java.util.Scanner;
class Arithmetic
{
int add(int a, int b)
{
int c=a+b;
return c;
}
int sub(int a, int b)
{
int c=a-b;
return c;
}
int multiplication(int a, int b)
{
int c=a*b;
return c;
}

int division(int a, int b)
{
int c=a/b;
return c;
}
int module(int a, int b)
{
int c=a%b;
return c;
}

}

class ArithMethode
{
public static void main(String[] args)
{
Arithmetic obj = new Arithmetic();
int Firstvalue,Secondvalue;
Scanner sc = new Scanner(System.in);

System.out.println("Enter firstvalue");
Firstvalue=sc.nextInt();

System.out.println("Enter Secondvalue");
Secondvalue=sc.nextInt();

int result = obj.module(Firstvalue,Secondvalue);
System.out.println("The result is"+" "+result);
result = obj.add(Firstvalue,Secondvalue);
System.out.println("The result is"+" "+result);
result = obj.sub(Firstvalue,Secondvalue);
System.out.println("The result is"+" "+result);
result = obj.division(Firstvalue,Secondvalue);
System.out.println("The result is"+" "+result);
result = obj.multiplication(Firstvalue,Secondvalue);
System.out.println("The result is"+" "+result);
}
}