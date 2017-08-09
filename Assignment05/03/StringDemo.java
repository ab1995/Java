public class StringDemo{
	public static void main(String args[]){
		String s="ABC";
		String s1=new String("ABC");
		
		System.out.println("s==s1 "+(s==s1));
		System.out.println("s.equals(s1) "+s.equals(s1));
	}
}