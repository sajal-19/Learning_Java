package Assignment_01;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
	    String name;
		int age;
		String sec;
		int percentage;
		student arr[]=new student[6];
       
		for(int i=0;i<6;i++)
		{
			 name=obj.nextLine();
			 age=obj.nextInt();
			 obj.nextLine();
			 sec=obj.nextLine();
			 percentage=obj.nextInt();
			 obj.nextLine();
			 arr[i]=new student(name,age,sec,percentage);
		}

	float average;
	 average=( arr[0].percentage+arr[1].percentage+arr[2].percentage+arr[3].percentage+arr[4].percentage+arr[5].percentage)/6;
	 System.out.println("The average is:"+average);
	}

}
class student
{
	String name;
	int age;
	String sec;
	int percentage;
	student(String s, int a, String b,int per )
	{
		name=s;
		age=a;
		sec=b;
		percentage=per;
	}
}
