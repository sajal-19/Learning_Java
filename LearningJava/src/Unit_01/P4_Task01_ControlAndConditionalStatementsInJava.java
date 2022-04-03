package Unit_01;

public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		
		Statements obj= new Statements();
		
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
		
     }
}

class Statements {
	
	void DecisionMakingStatements() {
		
		int x=10;
		int y=12;
		if(x + y < 10) {
			System.out.println("x+y is less than 10");
		}
		else {
			System.out.println("x+y is greater than 20");
		}
		
		int num=2;
		
		switch (num) {
		case 0:
			System.out.println("number is 0");
			break;
		case 1:
			System.out.println("nnumber is 1");
			break;
		default:
			System.out.println(num);
		}
	}
	
	
	void LoopStatements() {
		
		int sum=0;
		for(int j=1;j<=10;j++) {
			sum=sum+j;
		}
		System.out.println("The sum of first 10 natural numbers is" + sum);
		
		String[] names= { "Java","C","C++","Python","Javascript" };
		System.out.println("Printing the content of the array names:\n");
		for(String name: names) {
			System.out.println(name);
		}
		
		
		int i=0;
		System.out.println("Printing the list of first 10 even numbers \n");
		while(i<=10) {
			System.out.println(i);
			i=i+2;
		}
		
		i=0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(i);
			i=i+2;
			
		}while(i<=10);
	}
	
	
	void JumpStatements() {
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i=0;i<=10;i++) {
			
			if(i==6) {
				continue;
			}
			
			System.out.println(i);
		}
	}
}