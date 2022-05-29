package unit_03;
import java.util.*;
public class ExceptionHandlingInJava {

	public static void main(String[] args) {
		
		
		System.out.println("Exceptions!");
		
		student s=new student();
		s.handleException();
		s.MultipleCatch();
		s.inputMismatchException();
		s.StackOverFlowError(10);
		s.IndexOutOfBound();
		s.manuallyThrowAnExceptionFromYourCode(17);
		s.nullPointerException();
		try {
			s.useofthrow(19);
		} catch (Exception e) {
			e.printStackTrace();
		}
		s.useOfThrows_and_Finally();
	}

}
class student
{
	void handleException()
	{
		try
		{
			//sensitive code
		
		int b=0;
		int a=100/b;
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	void MultipleCatch()
	{
		try
		{
			//sensitive code
		
		int b=0;
		int a=100/b;
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception e)       
		{
			// This is super class which consist all the exception classes all if write 
			// super then 
			// lower 
			// then the error come that is (sementic )
			System.out.println(e.getMessage());
		}
	}
    void inputMismatchException()
    {
    	Scanner sr=new Scanner(System.in);
    	try {
    	int a=sr.nextInt();
    	System.out.println(a);
    	}catch(InputMismatchException e)
    	{
    		System.out.println("INput Exception Handled");
    	}
    	System.out.println("Done");
    	
    }
    void StackOverFlowError(int a)
    {
    	
    	/*
    	 * This is a error not a exception 
    	 * so there is no solution in catch because we can'nt handle this error
    	 * that's the reason to be called that is this an error; 
    	 */
    	try
    	{
    		while(a>0)
    		{
    			a++;
    			StackOverFlowError(a);
    		}
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    	System.out.println("Done!");
    }
   void IndexOutOfBound()
   {
	   try {
	   int [] myNumbers= {1,2,3};
	   System.out.println(myNumbers[10]);
	   }catch(Exception e)
	   {
		   System.out.println("Something went wrong");
	   }
	   
	   //The finally statement lets you to execute after try and catch occur
	   // it is used to stop the sensitive things like (server, db, resources etc.)
	   //generally used to help developer to stop the things in a particular things
	   // it works either the exception is handle or not but can't work when error came
	   finally {
		   System.out.println("After try and catch Is occured");
	   }
   }
	  void manuallyThrowAnExceptionFromYourCode(int age) 
	  {
		  try {
			  if(age<18) {
				  
				  throw new ArithmeticException("ACeess deneid");  
			  }
			  else
			  {
				  System.out.println("You are an adult");
			  }
		  }
		  catch (Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
	  }
	  void nullPointerException()
	  {
		  try {
			  String s=null;
			  System.out.println(s.length());
		  }catch(NullPointerException e)
		  {
			  System.out.println(e.getMessage());
		  }
	  }
	 void useofthrow(int age) throws Exception
	 {
		 if(age>17)
			 throw new Exception();
		 else
			 System.out.println("No exceprion permission  granted");
	 }
	 void useOfThrows_and_Finally()
	 {
		
		 try {
		 useofthrow(16);
		 } catch (Exception e) {
		
		 e.printStackTrace();
		 }
	 }	
	 void checkedAndUncheckedException() {

			/*
			 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
			 * will not be caught at compile time - as there is no mistake but caught at
			 * runtime - because it is mathematically incorrect
			 */
			int x = 0;
			int y = 10;
			int z = y / x;

			System.out.println(z);

			// Checked Exception [Run this code over terminal and check compiler error]
			try {
				useofthrow(19);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		void manualExceptionThrow() {

			try {

				// Have to use try and Catch here!
				calculateArea(-1);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		void calculateArea(int r) throws ManualException {

			if (r < 0) {
				throw new ManualException();
			}

			int area = r * r;
			System.out.println(area);

		}

	}

	@SuppressWarnings("serial")
	class ManualException extends Exception {

		@Override
		public String getMessage() {
			String detailMessage = "Exception Occured!";
			return detailMessage;
		}

	}

