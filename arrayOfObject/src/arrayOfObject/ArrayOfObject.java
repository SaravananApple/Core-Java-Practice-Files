package arrayOfObject;

import java.util.Scanner;

class Product
{
int stu_Id;
String stu_Name;

Product (int id, String name)//construct class
{
this.stu_Id = id;
this.stu_Name = name;
	
}

void display()
{
System.out.println("student id is:"+" "+stu_Id+"   "+"Student name is:"+" "+stu_Name);	

}

}
public class ArrayOfObject {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array value");
		int  n = sc.nextInt();
		
		
		Product obj[] = new Product[5];
		
		obj[0] = new Product(1001,"Muthu");
		obj[1] = new Product(1002,"Ajay");
		obj[2] = new Product(1003,"Gowdham");
		obj[3] = new Product(1004,"Lalith");
		obj[4] = new Product(1005,"Selva");
	
obj[0].display();
obj[1].display();
obj[2].display();
obj[3].display();
obj[4].display();
	
	
	
	
	}

}
