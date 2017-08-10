package corejava.hospital;

public class InchargeA implements BpListener {

	@Override
	public void notify(int bp) {
		System.out.println("Alert for InchargeA BP: "+bp);
	}

}
