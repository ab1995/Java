package corejava.collections.employee2;

import java.util.HashMap;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year){
		 this.day=day;
		 this.month=month;
		 this.year=year;
	}
	
	@Override
	public boolean equals(Object obj) {
			return true;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}

public class Employee {

	public static void main(String[] args) {
		HashMap<Date, String> emp=new HashMap<Date, String>();
		Date d1=new Date(1,2,1985);
		Date d2=new Date(1,2,1995);
		Date d3=new Date(1,12,1998);
		Date d4=new Date(13,7,1983);
		Date d5=new Date(13,7,1983);
		emp.put(d1, "abc");
		emp.put(d2, "pqr");
		emp.put(d3, "fge");
		emp.put(d4, "asd");
		emp.put(d5, "ere");

		System.err.println(emp.get(d1));
	}
}
