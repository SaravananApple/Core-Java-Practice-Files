// Java program to illustrate
// loose coupling concept
public interface Pick
{
	void understand();
}
class Topic1 implements Pick {
public void understand()
	{
		System.out.println("Got it");
	}
} class Topic2 implements Pick {
public void understand()
	{
		System.out.println("understand");
	}
} public class LooseCoupling {
public static void main(String[] args)
	{
		Pick t = new Topic2();
		t.understand();
	}
}

