
public class ReverseTheWord {

	
	public static void main(String[] args) {
		
		String name = "Core java training";
		
		char a[] = name.toCharArray();
		
		for(int i=a.length;i>0;i--)
		{
			
			System.out.print(a[i]);
		}
		
		

	}

}
