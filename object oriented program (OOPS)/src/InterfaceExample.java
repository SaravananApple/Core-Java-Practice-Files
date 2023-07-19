interface Drawable
{
void draw();
}
class Rectangle implements Drawable
{
public void draw()
{
System.out.println("Draw a rectangle");
}
}
class Circle implements Drawable
{
public void draw()
{
System.out.println("Draw a circle");
}
}
class InterfaceExample
{
public static void main(String[] args)
{
Drawable sc = new Rectangle();
sc.draw();
}
}
