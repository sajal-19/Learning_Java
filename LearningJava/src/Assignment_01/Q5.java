package Assignment_01;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
	

		String name;
		int age;
		char department;
		int salary;
		Scanner obj=new Scanner(System.in);
		 
		Employee arr[]=new Employee[8];
		for(int i=0;i<8;i++)
		{
			name=obj.nextLine();
			age=obj.nextInt();
			obj.nextLine();
			department=obj.next().charAt(0);
			salary=obj.nextInt();
			obj.nextLine();
			arr[i]=new Employee(name,age,department,salary);
		}
		int sal_A=0;
		int sal_B=0;
		int sal_C=0;
		int sal_D=0;
		for(int i=0;i<8;i++)
		{
		 if(arr[i].department=='A')
				{
			      if(arr[i].salary>30000)
			      {
			    	  sal_A=+25000;
			      }
			      else
			      {
			    	  sal_A=+arr[i].salary;
			      }
				}
		else if(arr[i].department=='B')
				{
						if(arr[i].salary>30000)
					      {
					    	  sal_B=+25000;
					      }
					      else
					      {
					    	  sal_B=+arr[i].salary;
					      }
				}
		else if(arr[i].department=='C')
				{
						if(arr[i].salary>30000)
					      {
					    	  sal_C=+25000;
					      }
					      else
					      {
					    	  sal_C=+arr[i].salary;
					      }
				}
		else
			{
				
			if(arr[i].salary>30000)
		      {
		    	  sal_D=+25000;
		      }
		      else
		      {
		    	  sal_D=+arr[i].salary;
		      }
			
		    }
		}
   
		System.out.println("The total salary of department A:"+sal_A);
		System.out.println("The total salary of department B:"+sal_B);
		System.out.println("The total salary of department C:"+sal_C);
		System.out.println("The total salary of department D:"+sal_D);
	}

}
class Employee
{
  
	String name;
	int age;
	char department;
	int salary;
	
	Employee(String n, int a, char b , int s)
	{
		
		name=n;
		age=a;
		department=b;
		salary=s;
	}
	
}