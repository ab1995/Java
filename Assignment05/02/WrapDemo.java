import java.util.*;

public class WrapDemo{

	public static void main(String args[]){
		int[] nums=new int[args.length];
		
		for(int iter=0;iter<args.length;iter++)
			nums[iter]=Integer.parseInt(args[iter]);
		
		Arrays.sort(nums);
		
		for(int iter=0;iter<args.length;iter++)
			System.out.println("\n"+nums[iter]);
	}
}