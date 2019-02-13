package day2;

public class Employee {

	
	int salary;//Instance level variable
	int bonus;//Instance level variable
	
	public Employee() {
	System.out.println("I am a constructor");
	salary=300;
	bonus=40;
		
	}
	
	void calcuteSalary() {
		int totalSalary = salary + bonus;// Local variable
		System.out.println(totalSalary);
	}
	
	int calcuteSalary1() {
		int totalSalary = salary + bonus;
		//System.out.println(totalSalary);
		return totalSalary;
	}
	
	//Argument level variable
	int calcuteSalary2(int sal,int bon) {
		int totalSalary = salary + bonus;
		//System.out.println(totalSalary);
		return totalSalary;
	}
	
	int calcuteSalary3(int salary,int bonus) {
		int totalSalary = this.salary + this.bonus;
		//System.out.println(totalSalary);
		return totalSalary;
	}
	
}
