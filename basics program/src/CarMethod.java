class CarExample
{
String model;
String typeOfGear;
String engineType;
String ignitionType;
float price;
int capacity;
int weight;
float groundClearance;
String carType;

void Start()
{
}
void Run()
{
}
void Break()
{
}
void Stop()
{
}
}
class CarObjectExample
{
public static void main(String[] args)
{
CarExample car = new CarExample();
car.model = "BMW";
car.typeOfGear = "Helical Gear";
car.engineType = "Petrol Engine";
car.ignitionType = "Center";
car.price = 490000.3454f;
car.capacity=6;
car.weight = 150;
car.groundClearance = 4.5f;
car.carType = "SUV";
System.out.println(car.model+"\n"+car.typeOfGear+"\n"+car.engineType+"\n"+car.ignitionType+"\n"+car.capacity+"\n"+car.carType);
}
}