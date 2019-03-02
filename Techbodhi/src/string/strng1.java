package string;

public class strng1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str= "Neeraj Oli";
		// Length
		
		System.out.println(str.length());
		
		// Trim
		
		System.out.println(str.trim());
		
		//Chat At
		
		System.out.println(str.charAt(3));
		
		//Sub String
		
		String str2 =str.substring(7);
		System.out.println(str2);
		
		//Example for trim and substring
		
		String str4 = " Neeraj ";
		
		String str5 =str4.trim();
		
		String str6 =str5.substring(0);
		System.out.println(str6);
		
		// Replace
		String str7=str.replace("eer", "bab");
		System.out.println(str7);
				
		//SPlit
		String[] arr=str.split(" ");
		int i=arr.length;
		System.out.println(i);
		System.out.println(arr[1]);
		
		// Equals and EqualIgnoreCase
		
		String a= "Neeraj";
		String b= "neeraj";
		
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
	}

}
