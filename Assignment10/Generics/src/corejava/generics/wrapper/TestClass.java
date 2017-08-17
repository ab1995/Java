package corejava.generics.wrapper;

import java.util.*;

class WrapperClass<T>{
	private T obj;
	
	public WrapperClass(T obj){
		this.obj=obj;
	}
	
	public void set(T obj){
		this.obj=obj;
	}
	
	public T get(){
		return this.obj;
	}
}

public class TestClass {

	public static void printNumbers(List<? extends Number> list){
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void printMapKeyValues(HashMap<? extends Number, ?> map){
		
		Iterator itr=map.entrySet().iterator();
		
		while(itr.hasNext()){
			System.out.println("Entry: "+itr.next());
		}
	}
	
	public static void main(String[] args) {
		WrapperClass<Integer> obj=new WrapperClass(12);
		//System.out.println(obj.get());
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//printNumbers(list);
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "abs");
		hm.put(2, "abd");
		hm.put(3, "pqr");
		
		printMapKeyValues(hm);
		
	}
	
}