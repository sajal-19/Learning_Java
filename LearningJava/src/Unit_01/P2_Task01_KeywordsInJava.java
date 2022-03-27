package Unit_01;

public class P2_Task01_KeywordsInJava {

	 static int add(int a,int b)
     {
    	 System.out.println("In Function static");
    	 return (a+b);
     }
	  int multi(int a, int b)
	  {
		  System.out.println("In Function non-static");
	    	 return (a*b);
	  }
	public static void main(String[] args) 
	{
		System.out.println("P2_Task01_KeywordsInJava");
		/*
		 * Cannot used as token
		 Here we cannot use token(double ) as variable name 
		 
		int double=3;
        */
		int a=3;
		int b=4;
		System.out.println(a);
	     /*
	     Here we cannot use this token(int) as function name
		 void int()
		 {
			 System.out.println("Hello");
		 }
		 */
         
		int c=add(a,b);		
		System.out.println(c);
		 /* 
		   Here we cannot use this token(int) as class  name
		   
		   ABC int =new ABC();
		 */
		P2_Task01_KeywordsInJava  obj = new P2_Task01_KeywordsInJava();
		System.out.println(obj.multi(a, b));
	}
	
	   
	
}
