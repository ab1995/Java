class ComplexNumber{
	private double real;
	private double img;
	
	public ComplexNumber(double real, double img){
		this.real=real;
		this.img=img;
	}
	
	public  ComplexNumber addComplexNumber(ComplexNumber c2){
		double real = this.real+c2.real;
		double img = this.img+c2.img;
		return new ComplexNumber(real, img);
	}

	public ComplexNumber multiplyComplexNumber(ComplexNumber c2){
		double real = (this.real * c2.real) - (this.img * c2.img);	
		double img = (this.real * c2.img) + (this.img * c2.real); 
		return new ComplexNumber(real, img);
	}
	
	public void swapComplexNumber(ComplexNumber c2){
		double temp=0;
		
		temp=this.real;
		this.real=c2.real;
		c2.real=temp;
		
		temp=this.img;
		this.img=c2.img;
		c2.img=temp;
		
	}
	
	public String toString(){
		return (this.real+" + i("+this.img+")");
	}
	

}

public class TestComplexNumber{
	public static void main(String args[]){
		ComplexNumber complexNumber1=new ComplexNumber(1,1);
		ComplexNumber complexNumber2=new ComplexNumber(2,2);
		
		System.out.println("After Swapping");
		System.out.println("Complex Number_01: "+complexNumber1);
		System.out.println("Complex Number_02: "+complexNumber2);
		System.out.println("Addition: "+complexNumber1.addComplexNumber(complexNumber2));
		System.out.println("Multiplcation: "+complexNumber1.multiplyComplexNumber(complexNumber2));
		
		complexNumber1.swapComplexNumber(complexNumber2);
		System.out.println("After Swapping");
		System.out.println("Complex Number_01: "+complexNumber1);
		System.out.println("Complex Number_02: "+complexNumber2);
		System.out.println("Addition: "+complexNumber1.addComplexNumber(complexNumber2));
		System.out.println("Multiplcation: "+complexNumber1.multiplyComplexNumber(complexNumber2));	
	}

}