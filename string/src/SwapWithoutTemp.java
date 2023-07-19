import java.util.Scanner;
class SwapWithoutTemp{
public static void main(String[] args)
{
String a,b;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the first value to swap");
a = sc.next();

Scanner cs = new Scanner(System.in);
System.out.println("Enter the second value to swap");
b = cs.next();

System.out.println("Entered two string values are:"+"\n"+a+"\n"+b);

a = a+b;

b = a.substring(0,a.length()-b.length());

a = a.substring(b.length());

System.out.println("After swap the given two values"+"\n"+a+"\n"+b);







}
}