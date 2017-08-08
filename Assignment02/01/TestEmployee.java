class Employee{
	private String  empName;
	private int empId;
	private double empSalary;
	
	public Employee(String empName, int empId, double empSalary){
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
	}
	
	public double getSalary(){
		return this.empSalary;
	}
}

class Manager extends Employee{
	private double incentive;
	
	public Manager(String empName, int empId, double empSalary, double incentive){
		super(empName, empId, empSalary);
		this.incentive=incentive;
	}
	
	public double getSalary(){
		return super.getSalary()+this.incentive;
	}
	
}

class Labour extends Employee{
	private double overtime;
	
	public Labour(String empName, int empId, double empSalary, double overtime){
		super(empName, empId, empSalary);
		this.overtime=overtime;
	}
	
	public double getSalary(){
		return super.getSalary()+this.overtime;
	}
	
	
}

public class TestEmployee{
	
	public static double getTotalSalaryOfAllEmployee(Employee[] empArray){
		double totalSalary=0;
		for(int iter=0;iter<empArray.length;iter++)
		{
			totalSalary+=empArray[iter].getSalary();
		}
		return totalSalary;
	}
	
	public static void main(String args[]){
	
		Employee[] empArray=new Employee[3];
		empArray[0]=new Manager("John", 111, 1000, 100);
		empArray[1]=new Manager("Smith", 112, 2000, 100);
		empArray[2]=new Labour("Snow", 113, 3000, 200);
		
		System.out.println("Total Salary: "+getTotalSalaryOfAllEmployee(empArray));
	}
}