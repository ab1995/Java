public class StringImmutable{
	public static void main(String args[]){
		String str1="hello";
		String str2=" world";
		
		str1.concat(str2);
		
		System.out.println(str1);
		
		StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder(" world");
		sb1.append(sb2);
		System.out.println(sb1);
	}

}