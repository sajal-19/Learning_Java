package Assignment_01;

public class Q3 {

	public static void main(String[] args) {
		
		testclass t1=new testclass();
		t1.display(25);
		t1.display(7);

	}

}

 public interface in1
{
	void display(int p);
}
class testclass implements in1
{
	int flag=0;
	public void display(int p)
	{
		for(int i=2;i<=p/2;i++)
		{
			if(p%i==0)
			{
				System.out.println("Not prime:");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime Number");
		}
		flag=0;
	}
	
}