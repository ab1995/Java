import java.lang.reflect.*; 

public class ClassInfo{
	
	public static void main(String args[]) throws Exception{
		Class class_obj = Class.forName(args[0]); 
		
		Constructor con[] = class_obj.getDeclaredConstructors(); 
		Field f[] = class_obj.getDeclaredFields();
		Method m[] = class_obj.getDeclaredMethods(); 
		
		System.out.println("Constructors: \n");
		for(int i=0;i<con.length;i++)
			System.out.println(con[i]);
		
		System.out.println("\n\nFields: \n");
		for(int i=0;i<f.length;i++)
			System.out.println(f[i]);
		
		System.out.println("\n\nMethods: \n");
		for(int i=0;i<m.length;i++)
			System.out.println(m[i]);
	}
}