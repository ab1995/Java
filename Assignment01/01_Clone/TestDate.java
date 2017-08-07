
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
	
	
	public static void swapDate(Date[] d){
		
		Date temp=d[0];
		d[0]=d[1];
		d[1]=temp;
	}
	
	
}




public class TestDate{
	
	public static void main(String args[]){
		Date[] dateObj=new Date[2];
		 dateObj[0]=new Date();
		 dateObj[1]=new Date(7,8,2017);
		
		
		System.out.println("Before Swapping");
		dateObj[0].printDate();
		dateObj[1].printDate();
		
		Date.swapDate(dateObj);
		System.out.println("After Swapping");
		dateObj[0].printDate();
		dateObj[1].printDate();
	}
}
