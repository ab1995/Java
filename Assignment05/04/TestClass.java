/*
java -Djava.security.manager  -Djava.security.policy==reflectDeny.policy  TestClass
*/

import java.lang.reflect.*;

class SampleClass {
	private String message = "Private Variable";

	public int temp=22;


	private String PrintMessage(){
		return ("Message from Private Method");

	}

	public void dummy(){}
}

class TestClass{
	public static void main(String args[]) throws Exception{
		
		Class class_obj = SampleClass.class;

		Field[] fields=class_obj.getDeclaredFields();

		for(int i=0;i<fields.length;i++){
			if(Modifier.toString(fields[i].getModifiers()).equals("private")){
				fields[i].setAccessible(true);
				System.out.println(fields[i].getName()+": "+fields[i].get(new SampleClass()));
			}
		}

		Method[] methods=class_obj.getDeclaredMethods();

		for(int i=0;i<methods.length;i++){
			if(Modifier.toString(methods[i].getModifiers()).equals("private")){
				methods[i].setAccessible(true);
				System.out.println(methods[i].getName()+": "+methods[i].invoke(new SampleClass(), new Object[]{}));
			}				
		}

	}
}