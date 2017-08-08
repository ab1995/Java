import java.util.*;

interface Sortable{
	int compare(Sortable s1);
}


class Circle implements Sortable{
	private int radius;
	
	public Circle(int radius){
		this.radius=radius;
	}
	
	public int getRadius(){
		return this.radius;
	}
	
	public void print(){
		System.out.println(this.radius);
	}
	
	public int compare(Sortable s1){
		Circle c1=(Circle)s1;
		if(this.getRadius()>c1.getRadius())
			return 1;
		else if(this.getRadius()==c1.getRadius())
			return 0;
		else
			return -1;
	}
	
}

public class TestSortable{
	
	public static void sortAll(Sortable c[]){		

		for(int iter_i=0; iter_i<c.length;iter_i++){
			for(int iter_j=1;iter_j<c.length-iter_i;iter_j++){
				if(c[iter_j-1].compare(c[iter_j])==1){
					Sortable temp=c[iter_j-1];
					c[iter_j-1]=c[iter_j];
					c[iter_j]=temp;
				}
			}
		}
		
	}
	 
				 
	public static void main(String args[]){
		Sortable c[]=new Sortable[3];
		c[0]=new Circle(2);
		c[1]=new Circle(1);
		c[2]=new Circle(3);
		
		
		TestSortable.sortAll(c);
		
		for(int i=0;i<c.length;i++)
		{
			Circle temp=(Circle)c[i];
			temp.print();
		}
	}
}