import java.util.Scanner;
class FactWhile
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);

int i;

System.out.println("Enter Value");
i=scan.nextInt();

while(i<100)
{
i=i*3;
System.out.println(i);
  
}
}
}