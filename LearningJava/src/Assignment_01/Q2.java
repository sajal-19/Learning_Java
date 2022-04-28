package Assignment_01;

public class Q2 {

	public static void main(String[] args) {
		
		car c1=new car();
		car c2=new car();
		car c3=new car();
		c1.display();
		c2.display();
		c3.display();
		c1.display();
		 System.out.println("The count is:"+c1.count);

	}

}
class car
{
	static int  count=0;
	
	void display()
	{
		System.out.println("Calling the member function");
		count++;
	}
	
}