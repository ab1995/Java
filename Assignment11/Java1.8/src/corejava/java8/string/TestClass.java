package corejava.java8.string;

import java.util.*;
import java.util.function.Consumer;

public class TestClass {
	
	
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();
		ArrayList<String> list=new ArrayList<>();
		list.add("adfsdf");
		list.add("dftr");
		list.add("derr");
		
		
		Consumer<String> filter=(String s)->str.append(s.charAt(0));
		
		for(String st:list){
			filter.accept(st);
		}
		
		System.out.println(str);
	}
}