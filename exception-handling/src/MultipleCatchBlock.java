
public class MultipleCatchBlock {

	public static void main(String[] args) {
		try
		{
			int data = 100/0;
		}

	catch(ArithmeticException e)
		{
		System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		
		catch(Exception e)
		{
		System.out.println("Parent Exception occurs");
		}
	finally {
		System.out.println("Finally code is executed");
	}
		
		
	System.out.println("Rest of the code");
	
	
	}

}
