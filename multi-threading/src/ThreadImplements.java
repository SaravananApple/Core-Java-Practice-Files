
public class ThreadImplements implements Runnable{
	public void run()
	{
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		
		ThreadImplements t1 = new ThreadImplements();
		
		Thread m1 = new Thread(t1);
		
		m1.run();
		
	}

}
