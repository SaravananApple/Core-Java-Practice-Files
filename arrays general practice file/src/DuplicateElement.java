import java.util.Scanner;
class DuplicateElement
{
public static void main(String[] args)
{
int[] a = new int[9];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the values");

for(int i=0;i<9;i++)
{
a[i]=sc.nextInt();
}

for(int i=0;i<9;i++)
{
for(int j=i+1;j<9;j++)
{
if(a[i]==a[j])
{

System.out.print(a[j] + " ");
}
}
}



}
}