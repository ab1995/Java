import java.util.*;

abstract class DessertItem{

	abstract public double getCost();
}

class Candy extends DessertItem{
	private double candyCost;
	private double candyTax;
	
	public Candy(int cost, double tax){
		this.candyCost=cost;
		this.candyTax=tax;
	}
	
	public double getCost(){
		return this.candyCost+this.candyTax;
	}
	
}

class Cookie extends DessertItem{
	private double cookieCost;
	private double cookieTax;
	
	public Cookie( double cost, double tax){
		this.cookieCost=cost;
		this.cookieTax=tax;
	}
	
	public double getCost(){
		return this.cookieCost+this.cookieTax;
	}
	
}

class IceCream extends DessertItem{
	private double iceCreamCost;
	private double iceCreamTax;
	
	public IceCream( double cost, double tax){
		this.iceCreamCost=cost;
		this.iceCreamTax=tax;
	}
	
	public double getCost(){
		return this.iceCreamCost+this.iceCreamTax;
	}

}

class DessertShop{

		private static ArrayList<DessertItem> candyList = new ArrayList<DessertItem>();
		private static ArrayList<DessertItem> cookieList = new ArrayList<DessertItem>();
		private static ArrayList<DessertItem> iceCreamList = new ArrayList<DessertItem>();
		
		public int getSize(String item){
			int quant=0;
			if(item=="candy")
				quant=this.candyList.size();
			else if(item=="cookie")
				quant=this.cookieList.size();
			else if(item=="iceCream")
				quant=this.iceCreamList.size();
			return quant;
		}
		
		public void addItem(String item, int quant){
			if(item=="candy"){		
				for(int iter=0;iter<quant;iter++){
					this.candyList.add(new Candy(10,1));
				}	
			}
			else if(item=="cookie"){
				for(int iter=0;iter<quant;iter++){
					this.cookieList.add(new Candy(10,1));
				}	
			}
			else if(item=="iceCream"){
				for(int iter=0;iter<quant;iter++){
					this.iceCreamList.add(new Candy(10,1));
				}	
			}		
		}
		
		public void removeItem(String item, int quant){
			
			if(item=="candy"){		
				for(int iter=this.candyList.size()-1;iter>=quant;iter--){
					this.candyList.remove(iter);
				}	
			}
			else if(item=="cookie"){
				for(int iter=this.cookieList.size()-1;iter>=quant;iter--){
					this.cookieList.remove(iter);
				}	
			}
			else if(item=="iceCream"){
				for(int iter=this.iceCreamList.size()-1;iter>=quant;iter--){
					this.iceCreamList.remove(iter);
				}	
			}				
		}
		
		public double getBill(String item, int quant){
			double bill=0.0;
			if(item=="candy"){		
				bill=this.candyList.get(0).getCost()*quant;	
			}
			else if(item=="cookie"){
				bill=this.cookieList.get(0).getCost()*quant;	
			}
			else if(item=="iceCream"){
				bill=this.iceCreamList.get(0).getCost()*quant;	
			}	

			return bill;
		}
		
}

public class TestDessertShop{
	public static void main(String[] args){
		
		int choice=0;
		Scanner sc=new Scanner(System.in);
		DessertShop dessertShop=new DessertShop();

		
		
		do{
			System.out.println("\n 1) Customer\n 2) Owner\n 3) Exit\n\n Your Choice: ");
			choice=sc.nextInt();
			int ch=0;			
			switch(choice){
				case 1: System.out.println("Customer");

						do{
							System.out.println("\n\n 1) Buy Candy\n 2) Buy Cookie\n 3) Buy IceCream\n 4) Exit\n\n Your Choice: ");
							ch=sc.nextInt();
							int quant=0;
							switch(ch){
								case 1: 
										System.out.println("Enter quantity of Candy to order: ");
										quant=sc.nextInt();
										if(quant>dessertShop.getSize("candy"))
											System.out.println("Order can't be placed. Available Candies: "+dessertShop.getSize("candy"));
										else if(quant==0 || quant<0)
											System.out.println("Please enter correct quantity");
										else{
											dessertShop.removeItem("candy", quant);
											System.out.println("Bill: "+dessertShop.getBill("candy", quant));		
										}
										
										break;
								case 2: 
										System.out.println("Enter quantity of Cookie to order: ");
										quant=sc.nextInt();
										if(quant>dessertShop.getSize("cookie"))
											System.out.println("Order can't be placed. Available Candies: "+dessertShop.getSize("cookie"));
										else if(quant==0 || quant<0)
											System.out.println("Please enter correct quantity");
										else{
											dessertShop.removeItem("cookie", quant);
											System.out.println("Bill: "+dessertShop.getBill("cookie", quant));
										}
										
										break;
								case 3: 
										System.out.println("Enter quantity of IceCream to order: ");
										quant=sc.nextInt();
										if(quant>dessertShop.getSize("iceCream"))
											System.out.println("Order can't be placed. Available Candies: "+dessertShop.getSize("iceCream"));
										else if(quant==0 || quant<0)
											System.out.println("Please enter correct quantity");
										else{
											dessertShop.removeItem("iceCream", quant);
											System.out.println("Bill: "+dessertShop.getBill("iceCream", quant));
											
										}
										break;
								case 4:break;
								default: System.out.println("Please Enter Correct Choice");
							}
						}while(ch!=4);
						break;

						
				case 2: 
						do{
							System.out.println("\n\n 1) Add Candy\n 2) Add Cookie\n 3) Add IceCream\n 4) Exit\n\n Your Choice: ");
							ch=sc.nextInt();
							int quant=0;
							switch(ch){
								case 1: System.out.println("Enter quantity of Candy to add: ");
										quant=sc.nextInt();
										dessertShop.addItem("candy", quant);
										System.out.println("\n Total Candies: "+dessertShop.getSize("candy"));
										break;
								case 2: System.out.println("Enter quantity of Cookie to add: ");
										quant=sc.nextInt();
										dessertShop.addItem("cookie", quant);
										System.out.println("\n Total Cookies: "+dessertShop.getSize("cookie"));
										break;
								case 3: System.out.println("Enter quantity of IceCream to add: ");
										quant=sc.nextInt();
										dessertShop.addItem("iceCream", quant);
										System.out.println("\n Total IceCereams: "+dessertShop.getSize("iceCream"));
										break;
								case 4:break;
								default: System.out.println("Please Enter Correct Choice");
							}
						}while(ch!=4);
						break;
				case 3: break;
				default: System.out.println("Please Enter Correct Choice");
			}
			
			
		}while(choice!=3);
		
	}	
	
}