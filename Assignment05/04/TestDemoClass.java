import java.lang.reflect.*; 

class DemoClass{
	
	private String name;
	private int id;
	public DemoClass(){
		System.out.println("Default Constructor");
	}
	
	public DemoClass(String name){
		this.name=name;
		System.out.println("Name: "+name);
	}
	
	public DemoClass(String name, int id){
		this.name=name;
		this.id=id;
		System.out.println("Name: "+name+"\tID: "+id);
	}
	
	
}

public class TestDemoClass{
	
	public static void main(String args[]) throws Exception{
		Class class_obj = Class.forName("DemoClass");
		Constructor con[] = class_obj.getDeclaredConstructors(); 
		
		Class[][] pTypes=new Class[con.length][];
		for(int i=0;i<con.length;i++)
			pTypes[i]=con[i].getParameterTypes();
		
		for(int i=0;i<pTypes.length;i++){
			
			if(pTypes[i].length==0){
				Object o=class_obj.newInstance();
			}
			else{
				
				Object[] obj=new Object[pTypes[i].length];
				
				for(int j=0;j<pTypes[i].length;j++){

					if(pTypes[i][j]==String.class)
						obj[j]="ajay";
					else if(pTypes[i][j]==int.class)
						obj[j]=111;
					
				}

				Object o=con[i].newInstance(obj);
				
			}	
			
			
			
		}
	}

}