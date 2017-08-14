package corejava.hospital;

import java.util.*;
import java.lang.reflect.*;

public class Patient {

	public static void main(String[] args) throws Exception {
		
		Class[] classList =new Class[]{ InchargeA.class, InchargeB.class}; 
		Random rand = new Random();
		for(int j=0;j<10;j++){
			int bp=rand.nextInt(300)+10;
			System.out.println("BP: "+bp);
			
			if(bp>140){	
				for(int i=0;i<classList.length;i++){
					if(BpListener.class.isAssignableFrom(classList[i])){
						Method m = classList[i].getMethod("notify", new Class[]{int.class});
						Object result= m.invoke(classList[i].newInstance(), new Object[]{bp});	
					}
				}
			}
			
		}
		

	}

}
