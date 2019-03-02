package functions;

public class accessModifier 

{
	
	public void publicfun()
	{
		System.out.println("Public from Accessmdifiers");
	}
	
  private void privatefun() 
  {
	  System.out.println("private from Accessmdifiers");
  }
  
  protected void protectedfun()
  {
	  System.out.println("protected from Accessmdifiers");
  }
  
  void noAccesModFun()
  {
	  System.out.println("noaccessMod from Accessmdifiers");
  }
  
  public static void main(String[] args) 
  {
	  accessModifier obj=new accessModifier();
	  obj.protectedfun();
	  obj.noAccesModFun();
	  obj.protectedfun();
	
}
}
