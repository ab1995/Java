abstract class Shape{

	abstract public void draw();
}

class Line extends Shape{
	
	public void draw(){
		System.out.println("In Line");
	}
}

class Rectangle extends Line{
	
	public void draw(){
		System.out.println("In Rectangle");
	}
}

class Cube extends Rectangle{
	
	public void draw(){
		System.out.println("In Cube");
	}
}

public class TestShape{
	
	public static void drawAllShapes(Shape shapes[]){
		for(int i=0;i<shapes.length;i++)
		{
			shapes[i].draw();
		}
	}
	
	public static void main(String args[]){
		Shape shapes[]=new Shape[3];
		shapes[0]=new Line();
		shapes[1]=new Rectangle();
		shapes[2]=new Cube();
		TestShape.drawAllShapes(shapes);
		
	}
}