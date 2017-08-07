
class Date{
	private int day;
	private int month;
	private int year;
	
	public Date(){
		this.day=01;
		this.month=01;
		this.year=1970;
	}
	

	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;	
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

	public void printDate(){
		System.out.println(this.day+"-"+this.month+"-"+this.year);
	}
	
	

	
	/*public static void swapDate(Date d1, Date d2){
		Date temp=new Date();
		
		Date temp=d1;
		d1=d2;
		d2=temp;
		
		
		temp.day=d2.day;
		d2.day=d1.day;
		d1.day=temp.day;
		
		temp.month=d2.month;
		d2.month=d1.month;
		d1.month=temp.month;
		
		temp.year=d2.year;
		d2.year=d1.year;
		d1.year=temp.year;
	
	}	*/

	
}

class DateWrapper{
	Date d;
	
	public DateWrapper(Date d){
		this.d=d;
	}
}



public class TestDate{
	
	public static void swapDate(DateWrapper d1, DateWrapper d2){
		
		Date temp=d1.d;
		d1.d=d2.d;
		d2.d=temp;
	}	
	
	public static void main(String args[]){
		Date dateObj1=new Date();
		Date dateObj2=new Date(7,8,2017);
		
		DateWrapper dw1=new DateWrapper(dateObj1);
		DateWrapper dw2=new DateWrapper(dateObj2);
		
		System.out.println("Before Swapping");
		dw1.d.printDate();
		dw2.d.printDate();
		
		swapDate(dw1, dw2);
		System.out.println("After Swapping");
		dw1.d.printDate();
		dw2.d.printDate();
	}
}
