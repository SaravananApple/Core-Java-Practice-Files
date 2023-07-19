abstract class Bike
{
abstract void run();
}
class Splendor extends Bike
{
void run()
{
System.out.println("Speed limit is 80km/hrs");
}
}
class Honda extends Bike
{
void run()
{
System.out.println("Speed limit is 150km/hrs");
}
}
class AbstractClass
{
public static void main(String[] args)
{
Bike Spl= new Splendor();
Bike Hon = new Honda();
Spl.run();
Hon.run();

}
}
