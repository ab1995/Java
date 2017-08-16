package corejava.collections.person;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person> {

	private double weight;
	private double height;
	private String name;
	
	public Person(double weight, double height, String name){
		this.weight=weight;
		this.height=height;
		this.name=name;
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.weight!=o.weight){
			if(this.weight>o.weight)
				return 1;
			else if(this.weight==o.weight)
				return 0;
			else
				return -1;
		}else{
			if(this.height>o.height)
				return 1;
			else if(this.height==o.height)
				return 0;
			else
				return -1;
		}
	}
	
	public String toString(){
		return "Name: "+this.name+" Weight: "+this.weight+" Height: "+this.height;
	}
	
	public static void main(String args[]){
		TreeSet<Person> persons=new TreeSet<Person>();
		
		persons.add(new Person(80.0, 5.9, "jay" ));
		persons.add(new Person(70.0, 5.4, "ajay" ));
		persons.add(new Person(60.0, 5.9, "vijay" ));
		persons.add(new Person(60.0, 4.9, "sanjay" ));
		
		Iterator<Person> itr=persons.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}


}
