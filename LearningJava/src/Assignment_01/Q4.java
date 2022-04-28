package Assignment_01;

public class Q4 {

	public static void main(String[] args) {
		
		three t1=new three(5);

	}

}
class one
{
	int num;
	one(int p)
	{
		num=p;
		System.out.println("Inside the one :"+ num);
		
	}	
}
class two extends one
{
	
	two()
	{
		super(1);
		System.out.println("Inside two");
	}
	
}
class three extends two
{
	int n;
	three()
	{
		System.out.println("Inside three default");
	}
	three(int x)
	{
		n=x;
		System.out.println("Inside three parameterized :"+n);
	}
}
