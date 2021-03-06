package corejava.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;
import corejava.annotation.Getter;

public class TestAnnotation {

	public static void main(String[] args) throws Exception {
		
		ClassLoader classLoader = TestAnnotation.class.getClassLoader();
		
		Class<Employee> obj = Employee.class;
		Field[] fields = obj.getDeclaredFields();
		
		
		for (Method method : obj.getDeclaredMethods()) {
			
			if (method.isAnnotationPresent(Getter.class)){
				if(method.getName().length()>3){
					if(method.getName().substring(0, 3).equals("get")){
						boolean flag=false;
						for(int i=0;i<fields.length;i++){
							if(method.getName().toString().substring(3, 4).equals(fields[i].getName().toString().substring(0, 1).toUpperCase())){
								
								int methodNameLength=method.getName().toString().length();
								if(method.getName().toString().toLowerCase().substring(3,methodNameLength).equals(fields[i].getName().toString().toLowerCase()) && fields[i].getType().toString().equals(method.getReturnType().toString())  && method.getParameterTypes().length == 0)
									flag=true;
							}
						}
						if(flag){
							//System.out.println("Getter Success");
						}
						else
							System.out.println("Getter Error at "+method.getName().toString());
						
					}
					else{
						System.out.println("Getter Error "+method.getName().toString());
					}
				}

			}
		}
		
	}
}
