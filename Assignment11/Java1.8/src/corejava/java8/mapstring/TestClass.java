package corejava.java8.mapstring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

public class TestClass {

	static StringBuilder str=new StringBuilder();
	
	public static void main(String[] args) {
		
		Consumer<String> filter=(String s)->str.append(s+"\n");
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "abs");
		map.put(2, "sdfsdf");
		
		Iterator itr=map.entrySet().iterator();
		
		while(itr.hasNext()){
			filter.accept(itr.next().toString());
		}
		
		System.out.println(str);
		
	}
}