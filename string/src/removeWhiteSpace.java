import java.util.Scanner;
class removeWhiteSpace{
public static void main(String[] args)
{

String str;

Scanner sc = new Scanner(System.in);
System.out.println("Enter your string to remove the white spaces");
str = sc.nextLine();




str = str.replaceAll("\\s+","");// without build-in method 

System.out.println(str);


}
}