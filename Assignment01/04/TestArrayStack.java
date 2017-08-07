class ArrayStack{
	private int stackArr[];
	private int top;
	private int maxSizeOfStack;
	
	public ArrayStack(int sizeOfStack){
		this.stackArr=new int[sizeOfStack];
		this.top=-1;
		this.maxSizeOfStack=sizeOfStack;
	}
	
	public void push(int data){
		if(top>maxSizeOfStack){
			System.out.println("Stack Overflow");
		}
		else{
			stackArr[++top]=data;
		}
	}
	
	public void pop(){
		if(top>-1)
		{
			System.out.println("Element Popped: "+stackArr[top]);
			top--;
		}
		else{
			System.out.println("Stack Underflow");
		}
	}
}

public class TestArrayStack{
	public static void main(String args[]){
	
		ArrayStack stack1=new ArrayStack(10);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.pop();	
	}
}