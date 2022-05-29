package unit_03;
import java.util.*;
public class P16_MultiThreadingInJava {

	public static void main(String[] args)
	{
        // Normal execution of the programs
		// where firstly the obj1 show function call then after obj2 show function call
		c1 obj1=new c1();
		obj1.show1();
		c2 obj2=new c2();
		obj2.show2();
		
		//Creating Threads 
		 
		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());
		
		
		t1.start();
		t2.start();
		
		
		Thread t4 = new Thread(new T4());
		  t4.start();
		  
		T3 t3= new T3();
		t3.start();
		

	}

}
class c1
{
	void show1()
	{
		Scanner obj= new Scanner(System.in);
		int a= obj.nextInt();
		System.out.println("a:"+a);
	}
	
}
class c2
{
	void show2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" In Class2: "+i);
		}
	}
}
class T1 extends Thread
{
	public void run()
	{
		Scanner obj= new Scanner(System.in);
		int b= obj.nextInt();
		System.out.println("b:"+b);	
	}
}
class T2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" In Thread 2 : "+i);
		}
	}
	
}
class T3 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" In Thread 3 : "+i);
		}
	}
}
class T4 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" In Thread 4 : "+i);
		}
	}
}