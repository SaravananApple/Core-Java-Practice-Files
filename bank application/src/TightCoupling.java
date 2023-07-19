
// Java program to illustrate
// tight coupling concept
// Tight coupling always dependent with each other class.
class Subject {
	Topic t = new Topic();
	public void startReading()
	{
		t.understand();
	}
}
class Topic {
	public void understand()
	{
		System.out.println("Tight coupling concept");
	}
}



public class TightCoupling {

	public static void main(String[] args) {
		

		Subject tt = new Subject();
		
		tt.startReading();
	
	}

}
