package corejava.exception.demo;

public class ExceptionDemo {

	public void dummy(){}
	
	public static void main(String[] args) {
	
		try{
			
			int x=2/1;
			
			try{
				ExceptionDemo d=new ExceptionDemo();
				d.dummy();
			}
			catch(ArithmeticException e){
				System.out.println("Nested catch");
			}
			finally{
				System.out.println("In nested finally");
			}
			
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Throwable e){
			System.out.println("In outer catch");
			//e.printStackTrace();
		}
		finally{
			System.out.println("In finally");
		}
	}

}
