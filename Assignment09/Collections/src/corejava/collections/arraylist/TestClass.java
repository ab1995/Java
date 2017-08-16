package corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestClass {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("abc");
		list.add("pqr");
		list.add("wrt");
		list.add("sdf");
		list.add("abc");
		
		ListIterator<String> itr=list.listIterator(list.size());
		
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}

}
