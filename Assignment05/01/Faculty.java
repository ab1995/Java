package fact;

public class Faculty{

	private int[] marks=new int[3];
	
	public Faculty(){
		marks[0]=65;
		marks[1]=43;
		marks[2]=74;
	}
	public int getStudentMarks(int roll){
		return this.marks[roll];
	}
	

	
	
}