package corejava.hospital;

import java.util.Random;

public class Hospital {
	private  BpListener[] obj;
	
	public Hospital(){
		this.obj=new BpListener[]{new InchargeA(), new InchargeB()};
	}
	
	
	public  void checkBp(Patient p) throws Exception{
		Random rand = new Random();
		for(int j=0;j<50;j++){
			int bp=rand.nextInt(150);
			p.setBp(bp);
			
			//System.out.println("BP: "+p.getBp());
			
			if(bp>140){	
				InformListeners.informBpListeners(this.obj, bp);
			}
			else
				System.out.println("BP: "+p.getBp());
			
		}
	}

	public static void main(String[] args) throws Exception {

		Hospital hosp=new Hospital();
		Patient p1=new Patient();
		
		hosp.checkBp(p1);
		

	}
}
