import java.util.*;

class Date implements Cloneable{
	private int day;
	private int month;
	private int year;
	

	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;	
	}
	
	public Date(Date dob){
		this.day=dob.getDay();
		this.month=dob.getMonth();
		this.year=dob.getYear();
	}
	public int getDay(){
		return this.day;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public void setDate(Date dob){
		this.day=dob.getDay();
		this.month=dob.getMonth();
		this.year=dob.getYear();
	}

	public void printDate(){
		System.out.println(this.day+"-"+this.month+"-"+this.year);
	}
	
	public String toString(){
		return this.day+"-"+this.month+"-"+this.year;
	}
	
	public  Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			return null;
		}
	}
	
}

class Employee implements Cloneable {
	private Date dateOfBirth;
	
	public Employee(Date dateOfBirth){
		this.dateOfBirth=new Date(dateOfBirth);
	}

	public Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			return null;
		}	
		
	}
	
	/*public Object clone(){
		//return new Employee(this.dateOfBirth);
		try{
			Employee e=(Employee)super.clone();
			Date d=(Date)this.dateOfBirth.clone();
			e.setDateOfBirth(d);
			return e;
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			return null;
		}
	}*/
	
	
	public Date getDateOfBirth(){
		return this.dateOfBirth;
	}
	
	public void setDateOfBirth(Date date){
		this.dateOfBirth= new Date(date.getDay(), date.getMonth(), date.getYear());
	}
}

public class TestEmployee{
	public static void main(String args[]){
		Employee e1=new Employee(new Date(12,01,1985));
		Employee e2=(Employee)e1.clone();
		e1.getDateOfBirth().setDate(new Date(13,02,1984));
		if(e1.getDateOfBirth()==e2.getDateOfBirth()){
			System.out.println("Shallow Copy");
		}
		else{
			System.out.println("Deep Copy");
		}
		System.out.println(e1.getDateOfBirth()==e2.getDateOfBirth());
		
		System.out.println("e1="+e1.getDateOfBirth()+"\te2="+e2.getDateOfBirth());
		
	}
}