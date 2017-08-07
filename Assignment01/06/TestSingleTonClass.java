 class DemoSingleTon{
	private static DemoSingleTon singleObj;
	
	private DemoSingleTon(){
	
	}
	
	public static DemoSingleTon getInstance(){
		if(singleObj==null){
			singleObj=new DemoSingleTon();
		}
		return singleObj;
	}
	
	public void printMessage(){
		System.out.println("Its SingleTon Class");
	}
}

public class TestSingleTonClass{
	public static void main(String args[]){
		DemoSingleTon obj1=DemoSingleTon.getInstance();
		obj1.printMessage();
	}
}