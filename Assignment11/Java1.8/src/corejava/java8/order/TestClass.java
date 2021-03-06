package corejava.java8.order;

import java.util.ArrayList;
import java.util.function.Predicate;

class Order{
	private int price;
	private String status;
	
	public Order(int price, String status){
		this.price=price;
		this.status=status;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public String toString(){
		return ("Price: "+this.price+"\t Status: "+this.status);
	}
}

public class TestClass {

	static Predicate<Order> orderPrice=(Order o)-> o.getPrice()>10000;
	static Predicate<Order> orderStatus=(Order o)-> o.getStatus().equals("ACCEPTED")||o.getStatus().equals("COMPLETED");

	
	public static void filterOrders(ArrayList<Order> list, Predicate obj){
		for(Order o:list){
			if(obj.test(o))
				System.out.println(o);
		}
	}

	public static void main(String[] args) {

		ArrayList<Order> orders=new ArrayList<>();
		orders.add(new Order(11000, "ACCEPTED"));
		orders.add(new Order(100, "COMPLETED"));
		orders.add(new Order(20000, "REGECTED"));
		orders.add(new Order(15000, "ACCEPTED"));
		
		//filterOrders(orders, orderPrice);
		filterOrders(orders, orderStatus);
	}

}
