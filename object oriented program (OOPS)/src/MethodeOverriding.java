class Parents

{
void add()
{
System.out.println("Hi");
}
}
class child extends Parents
{

void add()
{

System.out.println("I'm from mars");


}
}
class MethodeOverriding
{
public static void main(String[] args)
{
Parents B = new child();
B.add();

}
}