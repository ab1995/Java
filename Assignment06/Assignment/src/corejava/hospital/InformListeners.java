package corejava.hospital;

class InformListeners {

	public static void informBpListeners (BpListener[] obj, int bp) throws Exception{
		
		for(int i=0;i<obj.length;i++){
				obj[i].notify(bp);
		}
		
	}
}
