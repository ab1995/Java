package corejava.hospital;

public class InchargeB implements BpListener {

	@Override
	public void notify(int bp) {
		System.out.println("Alert for InchargeB  BP: "+bp);
	}

}
