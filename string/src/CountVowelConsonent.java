import java.util.Scanner;

class CountVowelConsonent
{
public static void main(String[] args)
{
int vCounts  = 0;
int cCounts = 0;

String str;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string which you want to get consonent and vowels");
str = sc.nextLine();

String word = str.toLowerCase();

for(int i=0;i<str.length();i++)
{

if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
vCounts++;
}
else if(str.charAt(i)>='a'&& str.charAt(i)<='z')  //ASCII code
{
cCounts++;
}

}


System.out.println("Number of counts in vowels:"+" "+vCounts);
System.out.println("Number of counts in consonent:"+" "+cCounts);




}
}