class Member{

	private int age;
	private long phone;
	private String name,address;
	private double salary;
	Member(int a,String n,long p,String ad,double s){
		age=a;
		name=n;
		phone=p;
		address=ad;
		salary=s;
	}
	Member(){
		this(18,"Sreejith",6282540914l,"Sreenilayam,Sasthavattom",100000);
	}
	void display(){
		System.out.println("Age : "+age+ "\nname: "+ name +"\nPhone: "+ phone+"\nAddress: "+address+"\nsalary:"+salary);	
	}
	public void printSalary(){
		System.out.println("Salary of "+name+" : "+salary);
	}
}
class Employee extends Member{

	private String specialization,department;
	Employee(){
		specialization="Network Security";
		department="R&D";
		display();
	}
	Employee(String a,String b){
		super();
		specialization=a;
		department=b;
	}
	Employee(int a,String n,long p,String ad,double s,String sp,String dep){
		super(a,n,p,ad,s);
		specialization=sp;
		department=dep;
	}
	void display(){
		super.display();
		System.out.println("Specialisation : "+specialization+"\nDepartment : "+department);
	}
}

public class MemberDemo{
	public static void main(String[] args){
		Employee e1=new Employee();
		Employee e2=new Employee("sdp","dep");
		e2.printSalary();
		
	}
}
