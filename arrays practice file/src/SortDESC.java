import java.util.Scanner;
public class SortDESC {

public static void main(String[] args) {
int temp;
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array size");
n = sc.nextInt();
int a[] = new int[n];
            
System.out.println("origianl array element");
for(int i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
		
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
             
for(int i=0;i<n;i++)
{
 System.out.println(a[i]);
}


}

}

