package corejava.java8.thread;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestClass {

	
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		Consumer<Integer> print = number-> System.out.println(number);
		list.add(1);
		list.add(2);
		list.add(3);
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for(Integer num:list)
					print.accept(num);
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
	}
}