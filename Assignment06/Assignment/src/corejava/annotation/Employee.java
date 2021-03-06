package corejava.annotation;

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	@Getter
	public int getId(){
		return this.id;
	}
	
	@Getter
	public String getName(){
		return this.name;
	}
	
	@Getter
	public void setName(String name){
		this.name=name;
	}
}
