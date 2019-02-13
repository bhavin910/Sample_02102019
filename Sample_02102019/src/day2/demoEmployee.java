package day2;

public class demoEmployee {

	public static void main(String[] args) {
	//Creating an object	
		//Step-1: Declaration of variable
		Employee Steve;// Steve is a member of class "Employee"
		
		//Step 2: Instantiation(it allocates memory) and Initialization (it sets default value)
		Steve = new Employee();//Employee() is a constructor.
		Steve.salary=111;
		Steve.bonus=444;
		Steve.calcuteSalary();
		
		System.out.println("//-----------------------------//");
		Employee John = new Employee();
		John.salary=1000;
		John.bonus=500;
		John.calcuteSalary();
		
		//  Using return type int
		System.out.println("//-----------------------------//");
		Employee Aaron = new Employee();
		Aaron.salary=1000;
		Aaron.bonus=500;
		int aaronSalary = Aaron.calcuteSalary1();
		System.out.println("Aaron's Salary is: "+ aaronSalary);
		
		//passing the variable as arguments
		System.out.println("//-----------------------------//");
		Employee Tom = new Employee();
		int tomSalary = Tom.calcuteSalary2(1000,500);
		
		System.out.println("Tom's Salary is: "+ tomSalary);
		
		System.out.println("//-----------------------------//");
		Employee pam = new Employee();
		pam.salary=50; pam.bonus=100;
		int pamSalary = pam.calcuteSalary3(1000,500);
		
		System.out.println("Pam's Salary is: "+ aaronSalary);
		
		
		
	}

}
