class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
//Stack class using linked list
class Stack{
	private Node top;
	public Stack(){
		this.top=null;
	}
	//push operation
	public void push(int data) {
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
	}
	//pop operation
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow!Cannot pop from an empty stack.");
			return -1;
		}
		int poppedData=top.data;
		top=top.next;
		return poppedData;
	}
	//peek operation
	public int peek() {
		if(isEmpty()){
			System.out.println("Stack is empty!");
			return -1;
		}
		return top.data;
	}
	//check if stack is empty
	public boolean isEmpty() {
		return top==null;
	}
	//Display stcak elements
	public void display() {
		if(isEmpty()){
			System.out.println("Stack is empty!");
			return;
		}
		Node temp=top;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("None");
	}
}//Usage
public class Main{
	public static void main(String[] args){
		Queue queue=new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		System.out.println("Dequeued:"+queue.dequeue());
		System.out.println("Front element:"+queue.peek());
		queue.display();
	}
}
		