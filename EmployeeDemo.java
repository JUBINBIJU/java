
//java program to store employee details

class Employee{
	
	private static int idcounter=0;		//static variable to keep track of ids
	private int id,ssn, age;
	private String name,des;
	private double salary;
	
	void setData( int s, int a, String n, String d,double sal){		//function to initialize instance variable
		
		id=++idcounter;
		ssn=s;
		age=a;
		name=n;
		des=d;
		salary=sal;
	}

	Employee getData(){			//function to return object

		return(new Employee(ssn,age,name,des,salary));
	}

	Employee(int s,int a,String n,String d,double sal){
								//constructor that takes all arguments; works same as setData()
		
		id=++idcounter;
		ssn=s;
		age=a;
		name=n;
		des=d;
		salary=sal;
	}

	Employee(){			//function with no arguments; initializes instance variables with default values

		this(123456789,20,"Vishnu","student",10000.00);
	}

	static double findAvgEmployeeForId(Employee e1,Employee e2){//function to return avg of id of two input 'Employee' objects

		return((e1.id+e2.id)/2.0);
	}

	static int getIdCounter(){			//function is required as 'idcounter' is a private variable of 'Employee' 							  	  class and hence cannot be accessed from 'main()'

		return idcounter;
	}

	public String toString(){			//should override 'String.toString()'

		return (" id : "+id+" Name : "+name +" SSN : "+ssn+" Age : "+age+" Designation : "+des+ " Salary : "+salary);

	}

}


public class EmployeeDemo{					//main class

	static int empvar=5;

	public static void main(String[] args){			//main function

		Employee employee1= new Employee(243461778,18,"Sreejith","student",12000);
		System.out.println("IdCounter : " + employee1.getIdCounter());
//the above two statements create an 'Employee' object with given values and prints current value of static variable 'idcounter'
//these steps are repeated for all 5 objects 
		Employee employee2= new Employee(123324562,20,"Jubin","student",12000);
		System.out.println("IdCounter : " + employee1.getIdCounter());
		Employee employee3= new Employee(987654321,19,"Sooraj", "student",11000);
		System.out.println("IdCounter : " + employee1.getIdCounter());
		Employee employee4= new Employee(8765432,19,"Suhail", "student" , 1000000);
		System.out.println("IdCounter : " + employee1.getIdCounter());
		Employee employee5= new Employee(123456780,20,"Zen","student", 10000);
		System.out.println("IdCounter : " + employee1.getIdCounter());
		System.out.println(Employee.findAvgEmployeeForId( employee1 , employee2 ));
//function to display contents of 'Employee' object
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
	}
}
