package stud;

import fact.Faculty;

public class Student{
	private String name;
	private int roll;
	private double marks;
	
	public Student(String name, int roll, double marks){
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public double getMarks(){
		return this.marks;
	}
	
	public void setMarks(double marks){
		this.marks=marks;
	}
	
	public void setRoll(int roll){
		this.roll=roll;
	}
	
	public int getroll(){
		return this.roll;
	}
	
	
	public static void main(String args[]){
		Faculty f=new Faculty();
		Student s=new Student("Ajay", 1, f.getStudentMarks(1));
		System.out.println("Marks: "+s.getMarks());
	}
}

