package corejava.exception.resource;


public class Sample implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("In Close method of Sample");
	}
	
	public void print(){
		System.out.println("In Sample");
	}

}
