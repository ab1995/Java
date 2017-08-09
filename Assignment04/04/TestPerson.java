import java.util.*;

class Person implements Comparable<Person> {
	private String name;
	private double height;
	private double weight;

	public Person(String name, double height, double weight){
		this.name = name;
		this.height=height;
		this.weight=weight;
	}

	public String getName(){
		return this.name;
	}

	public double getHeight(){
		return this.height;
	}

	public double getWeight(){
		return this.weight;
	}

	public String toString(){
		return "Name: "+this.name+"\t Height: "+this.height+"\t Weight: "+this.weight;
	}
	
	public int compareTo(Person p){
		if(this.weight>p.getWeight())
			return 1;
		else if(this.weight==p.getWeight())
			return 0;
		else
			return -1;
		
	}
	
}

class NameComparator implements Comparator<Person>{

	public int compare(Person p1, Person p2){
		return p1.getName().compareTo(p2.getName());
	}
}

class HeightComparator implements Comparator<Person>{

	public int compare(Person p1, Person p2){
		
		if(p1.getHeight()==p2.getHeight())
			return 0;
		else if(p1.getHeight()>p2.getHeight())
			return 1;
		else
			return -1;
	}
}

public class TestPerson{

	public static void main(String args[]){
		Person p[]=new Person[3];
		p[0]=new Person("John", 70, 74);
		p[1]=new Person("Smith", 74, 80);
		p[2]=new Person("Akon", 80, 70.1);

		Arrays.sort(p, new NameComparator());

		for(int i=0;i<p.length;i++){
			System.out.println(p[i]);
		}

		System.out.println("\n\n Height Based Sort");
		Arrays.sort(p, new HeightComparator());

		for(int i=0;i<p.length;i++){
			System.out.println(p[i]);
		}
		
		System.out.println("\n\n Weight Based Sort");
		Arrays.sort(p);

		for(int i=0;i<p.length;i++){
			System.out.println(p[i]);
		}
		
		
	}
}