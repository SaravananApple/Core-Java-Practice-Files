
public class LargestSmallestElement {

	public static void main(String[] args) {
		int a[] = {4,6,2,45,14,56,34}; 
		
		int largest  = a[0];
		int smallest  = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					largest = a[i];
				}
				
				if(a[i]<a[j])
				{
					smallest = a[j];
				}
			
			}
			
		}

		System.out.println("The largest value is:"+" "+largest+" "+"The smallest value is:"+" "+smallest);
		
		
	}

}
