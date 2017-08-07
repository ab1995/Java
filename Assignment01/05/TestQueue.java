class QueuedArray{
	private int queueArr[];
	private int front;
	private int maxSizeOfQueue;
	
	public QueuedArray(int sizeOfQueue){
		this.queueArr=new int[sizeOfQueue];
		this.front=-1;
		this.maxSizeOfQueue=sizeOfQueue;		
	}
	
	public void push(int data){
		if(front>maxSizeOfQueue){
			System.out.println("Queue OverFlow");
		}
		else{
			queueArr[++front]=data;
		}
	}
	
	public void pop(){
		if(front>-1){
			System.out.println("Popped Element: "+ queueArr[0]);
			for(int i=0;i<=front;i++)
			{
				queueArr[i]=queueArr[i+1];
			}
			front-=1;
		}
		else{
			System.out.println("Queue Underflow");
		}
	}
}

public class TestQueue{
	public static void main(String args[]){
	
		QueuedArray queue1=new QueuedArray(10);
		queue1.push(1);
		queue1.push(2);
		queue1.push(3);
		queue1.pop();
		queue1.pop();
		queue1.pop();
		queue1.pop();	
	}
}