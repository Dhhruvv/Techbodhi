package loops;

import functions.accessModifier;

public class Funtest extends accessModifier {

	public static void main(String[] args)
	{

		accessModifier fun=new accessModifier();
		fun.publicfun();
		
		Funtest fin=new Funtest();
		fin.protectedfun();
	}

}
