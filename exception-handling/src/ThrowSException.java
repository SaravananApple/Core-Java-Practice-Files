
public class ThrowSException {
	public static void validate(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Person isn't eligible to vote");
		}
		
		else
		{
			System.out.println("Person is eligible to vote");
		}	
	}
	
	public static void main(String[] args) {
		
	validate(13);
	System.out.println("rest of the code");


	}

}
