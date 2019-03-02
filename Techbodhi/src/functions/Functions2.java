package functions;

public class Functions2 

{
	public static void main(String[] args) {
		
		int add=sum(20,56);
		System.out.println(add);
		
		int mult=Multiply(60,42);
		System.out.println(mult);
	}

	public static int sum(int a, int b)
	{
			int c=a+b;
			return c;
	}
	
	public static int Multiply(int a, int b)
	{
		return a*b;
	}
	
	public int InterestCal(int p, int r, int n)
	
	{
	  return (p*r*n)/100;	
	}
	
	public int mod(int a, int b)
	{
		return a%b;
	}
}

