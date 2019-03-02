package assignment;

public class Assignment1 {

	public static void main(String[] args) 
	{
      /* // just have to print the below line
		String x="We are learning";
		String y="Mistakens happen";
		int z=1000;
		System.out.println("java is easy."+" "+x+" "+"selenium and"+" "+y+" "+z+"Times");*/
		
		// ( 2)  Write a for loop to print even numbers between 1 to 100
		      
		/*for(int i=2; i<100; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
			}
		}*/
		
		/*int n=5;
		for(int i=0; i<100; i++)
		{
			System.out.println(i);
			if(i%n==0)
			{
				System.out.println("divisible by 5 - "+" "+i);
			}
		}*/
			
			// (3)  Write a for loop to find the sum of first 100 numbers(1 to 100)
		
		int sum=0;
		for(int i=0; i<=100; i++)
		{
			
		sum=sum+i;
			
		}
		System.out.println(sum);
		
		
		// Program to print the pyramid of stars
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<i-1; j++)
			{
				System.out.println(" ");
				
			}
			for(int k=0; k<i; k++)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
	}

}
