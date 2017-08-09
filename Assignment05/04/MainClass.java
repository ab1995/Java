import java.lang.reflect.*; 

class NameOperator{
	public String getCapitalName(String name){
		return name.toUpperCase();
	}
	
	public int getSquare(int num){
		return num*num;
	}
	
	public static int getCube(int num){
		return num*num*num;
	}
}

class Middleware{

	public static  Object invokeMethod(String className, String methodName, Class[] parameterTypes, Object[] parameterValues) throws Exception	{
		Class class_obj = Class.forName(className); 
		Object obj=class_obj.newInstance();
		Method method=class_obj.getMethod(methodName, parameterTypes);
		Object result=method.invoke(obj, parameterValues);
		return result;
		
	}
}
	
public class MainClass{
	
	public static void main(String args[]) throws Exception{
		
	
		String res=(String)Middleware.invokeMethod("NameOperator", "getCapitalName", new Class[]{String.class}, new Object[]{"java"} );
		System.out.println(res);
		
		int square=(int)Middleware.invokeMethod("NameOperator", "getSquare", new Class[]{int.class}, new Object[]{2} );
		System.out.println("Square: "+square);
		
		int cube=(int)Middleware.invokeMethod("NameOperator", "getCube", new Class[]{int.class}, new Object[]{4} );
		System.out.println("Cube: "+cube);		
	}

}