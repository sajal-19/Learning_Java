package Unit_01;

public class P2_Task02_ConstantsInJava {
	public static final double Pi=3.14;  
	public static void main(String[] args) {
		
       System.out.println(Pi);
       /*
        *Here if re assingn the value of pi then it shows the error
       Pi=5;
       System.out.println(Pi);
       */
       print();
	}
  static void print()
  {
	  System.out.println("Inside the print function :"+Pi);
  }
}
