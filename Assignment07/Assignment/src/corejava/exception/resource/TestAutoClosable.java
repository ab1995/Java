package corejava.exception.resource;

public class TestAutoClosable {

	public static void main(String[] args) {

		try(Sample s=new Sample()){
			s.print();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
