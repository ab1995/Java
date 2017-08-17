package corejava.java8.removeif;

import java.util.*;
import java.util.function.*;

public class TestClass {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("abd");
		list.add("sfsdf");
		list.add("sdfd");
		
		Predicate<String> filter=(String elem)-> elem.length()%2==0?true:false;
		
		list.removeIf(filter);
		
		for(String str:list){
			System.out.println(str);
		}
	}
	
}
