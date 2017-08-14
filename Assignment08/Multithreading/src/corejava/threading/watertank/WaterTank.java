package corejava.threading.watertank;

public class WaterTank implements Runnable {

	private int currentWaterInTank;
	private final int CAPACITY=1000;
	private int capacityLimit;
	private int inFlowRate;
	private int outFlowRate;
	
	Thread t1, t2, t3;
	
	public WaterTank() {
		this.currentWaterInTank=500;
		this.capacityLimit=800;
		this.inFlowRate=50;
		this.outFlowRate=70;
		
		t1=new Thread(this);
		t1.setName("IN");
		t2=new Thread(this);
		t2.setName("OUT");
		t3=new Thread(this);
		t3.setName("CONTROLLER");
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	@Override
	public void run() {
		
		Thread currThread=Thread.currentThread();
		
		if(currThread.getName().equals("IN")){
			
			while(true){
				this.currentWaterInTank+=this.inFlowRate;
				try{Thread.sleep(1000);}catch(Exception e){}
				System.out.println("Current Capacity: "+this.currentWaterInTank);
			}

		}
		else if(currThread.getName().equals("OUT")){
			while(true){
				this.currentWaterInTank-=this.outFlowRate;
				try{Thread.sleep(1000);}catch(Exception e){}
				System.out.println("Current Capacity: "+this.currentWaterInTank);
			}
		}
		
		else if(currThread.getName().equals("CONTROLLER")){
			while(true){
				if(this.currentWaterInTank>800)
				{
					t1.suspend();
					t2.resume();
				
				}
				if(this.currentWaterInTank<800)
				{
					t2.suspend();
					t1.resume();
					
				}
			}
			
		}
	}
	
	public static void main(String args[]){
		new WaterTank();
	}

}
