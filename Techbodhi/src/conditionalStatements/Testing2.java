package conditionalStatements;

public class Testing2 {

	public static void main(String[] args) 
	
	// for Nested if
	
	{
		int a=10;
		int b=7;
		int c=15;
		
		if(a<b)
		{
			
			if(a<c)
			{
				
				System.out.println("a is smallest");
			}else
			{
				System.out.println("a is greter than c but less than b");
			}
			
		}else
		
		{
			System.out.println("a is greater than b");
		}
		
		

	}

}
