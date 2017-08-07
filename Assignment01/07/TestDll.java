class Node{
	private Node prev;
	private int data;
	private Node next;
	
	public Node(){
		prev=null;
		data=0;
		next=null;
	}
	
	public void setPrev(Node prev){
		this.prev=prev;
	}
	
	public void setNext(Node next){
		 this.next=next;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public Node getPrev(){
		return this.prev;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public int getData(){
		return this.data;
	}
}

class DoublyLinkedList{
	
	public Node startNode;
	
	public DoublyLinkedList(){
			this.startNode=null;
	}
	
	public void addNode(int data){
		if(this.startNode==null){
			this.startNode=new Node();
			this.startNode.setData(data);
		}		
		else{
			Node temp=new Node();
			temp=this.startNode;
			
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			
			Node newNode=new Node();
			newNode.setData(data);
			newNode.setPrev(temp);
			temp.setNext(newNode);
		}
	}
	
	public void printData(){
			Node temp=new Node();
			temp=this.startNode;
			
			if(temp==null)
			{
				System.out.println("List is Empty");
			}
			else{
				while(temp.getNext()!=null)
				{
					System.out.println(temp.getData());
					temp=temp.getNext();
				}		
				System.out.println(temp.getData());
			}
	}
	
	public int getCountOfNodes(){
		int count=0;
		Node temp=new Node();
		temp=this.startNode;
		
		if(temp==null){
			return 0;
		}
		else{
			while(temp.getNext()!=null)
			{
				count++;
				temp=temp.getNext();
			}
			return ++count;
		}
	}
	
	public void deleteNode(int data){
		int count=0;
		Node temp=new Node();
		temp=this.startNode;
		
		if(temp==null){
			System.out.println("List is Empty");
		}
		else{
			if(temp.getData()==data){
				this.startNode=this.startNode.getNext();
				this.startNode.setPrev(null);
			}
			else{
				temp=temp.getNext();
				while(temp.getNext()!=null){
					if(temp.getData()==data){
						temp.getPrev().setNext(temp.getNext());
						temp.getNext().setPrev(temp.getPrev());
					}
					temp=temp.getNext();
				}
				if(temp.getData()==data)
				{
					temp.getPrev().setNext(null);
				}
			}
			

		}		
	}
	
	
}

public class TestDll{
	public static void main(String args[]){
	
		
		DoublyLinkedList doublyLinkedList1=new DoublyLinkedList();

		doublyLinkedList1.addNode(1);
		doublyLinkedList1.addNode(2);
		doublyLinkedList1.addNode(3);
		doublyLinkedList1.printData();
		System.out.println("Count: "+doublyLinkedList1.getCountOfNodes());
		
		doublyLinkedList1.deleteNode(2);
		doublyLinkedList1.deleteNode(3);
		doublyLinkedList1.printData();
		System.out.println("Count: "+doublyLinkedList1.getCountOfNodes());
	}
}