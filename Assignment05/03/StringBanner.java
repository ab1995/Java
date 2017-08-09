public class StringBanner{
	public static void main(String args[]){
		
		StringBuilder str=new StringBuilder("Welcome to Java");
		try{
			while(true)
			{
				
				char temp=str.charAt(0);
				str.delete(0,1);
				str.append(temp);
				System.out.print("\r"+str);
				Thread.sleep(500);
			}
		
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}