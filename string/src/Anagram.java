import java.util.Arrays;
import java.util.Scanner;
class Anagram
{
public static void main(String[] args)
{
String name, rename;

Scanner sc = new Scanner(System.in);
System.out.println("Enter your first string value");
name = sc.next();

Scanner sc1 = new Scanner(System.in);
System.out.println("Enter your second string value");
rename = sc1.next();



name = name.toLowerCase();
rename = rename.toLowerCase();



if (name.length() != rename.length())
{
System.out.println("Both the string are not anagram");
}


else
{

char[] pros = name.toCharArray();
char[] cons = rename.toCharArray();

Arrays.sort(pros);
Arrays.sort(cons);

if(Arrays.equals(pros,cons)==true)
{
System.out.println("Both the string are anagram");
}

else
{
System.out.println("Both the string are not anagram");
}


}







}
}