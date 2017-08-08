abstract class Persistence{

	abstract public void persist();

}

class FilePersistence extends Persistence{
	
	public void persist(){
		System.out.println("data persisted into file");
	}
}

class DatabasePersistence extends Persistence{
	
	public void persist(){
		System.out.println("data persisted into database");
	}
}

class PersistenceFactory{
	
	public static Persistence getInstance(){
		return new FilePersistence();
	}
}

public class TestPersistence{
	public static void main(String args[]){
		Persistence persistenceObj=PersistenceFactory.getInstance();
		persistenceObj.persist();
	}
}