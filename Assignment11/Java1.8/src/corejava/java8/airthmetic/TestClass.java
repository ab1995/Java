package corejava.java8.airthmetic;

public class TestClass {
	public static void main(String[] args) {
		MathematicalOperation<Integer> addition=(a ,b )-> a+b;
		MathematicalOperation<Integer> multiplication=(a ,b )-> a*b;
		MathematicalOperation<Integer> substraction=(a ,b )-> a-b;
	
		System.out.println("SUM: "+addition.operate(1, 2));
		System.out.println("PRODUCT: "+ multiplication.operate(1, 2));
		System.out.println("DIFFERENCE: "+substraction.operate(1, 2));
	}
}
