import java.util.Scanner;
class DuplicateCharacters{
public static void main(String[] args) {
  
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string which you want to duplicate");
String str;
str = sc.next();

int count;


char arr[] = str.toCharArray();

System.out.println("Duplicate values in given string");



for(int i=0;i<arr.length;i++)
{

count = 1;

for(int j=i+1;j<arr.length;j++)
{

if(arr[i]==arr[j] && arr[i]!='0')
{
count++;

}

}

if(count>1 )
System.out.println(arr[i]);

} 
  
  
  
  
}
}












































