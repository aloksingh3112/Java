
public class Employee {
	
	private int id ;
	private String name ;
	private double salary ;
	private String branch;
	
	
public Employee() {
		// branch = "noida";
	}
		
	
/*	public Employee(int id,double salary){
		this();
		//this.id = id;
		// this.salary = salary;
		
		
		
	}
	
	
	
	public Employee(int id , String name,double salary) {
		
		this(id,salary);
		
		
		this.id = id;
		this.salary = salary;
		this.name = name;
		
	}*/
	public void input(int id,String name,double salary) {
		if(id<=0 && salary<=0) {
			System.out.println("enetr valid number");
			return;
		}
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		
		
	}
	public void DisplayDetail() {
		System.out.println("Id ="+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Branch ="+branch);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



