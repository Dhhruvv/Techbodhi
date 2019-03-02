package functions;

public class Funcalling {

	public static void main(String[] args)
	{
		
		//Static functions can only call static variables or static variables
		// to call non static functions, we have to create the instance of that particular class
		
		Functions2.sum(10,30);
		Functions2.Multiply(10, 30);
		
		Functions2 obj=new Functions2();
		int r = obj.InterestCal(1000, 56, 698);
		System.out.println(r);
		int m= obj.mod(20, 10);
		System.out.println(m);
		
		
		accessModifier fun=new accessModifier();
		fun.noAccesModFun();
		fun.protectedfun();
		
		
		
		// accessfier
		
		/*Public   - Through out the project
		
		Private   - within the class
		
		protected- within the package and by using child class we can access it outso
		
		No access modifier--------      within the package*/
		
		
		
		

	}

}
