package corejava.java8.unary;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class TestClass {
 
	public static void main(String[] args) {
		UnaryOperator<String> filter = (String str)-> str.toUpperCase();
		
		ArrayList<String> list=new ArrayList<>();
		list.add("adfsdf");
		list.add("dftr");
		list.add("derr");
		
		list.replaceAll(filter);
		for(String st:list){
			System.out.println(st);
		}
	}
}
