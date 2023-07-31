package task4;

public class LinkedListProgram9 
{
	class Node
	{
		int data;
		Node previous;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head,tail=null;
	
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}
		else
		{
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
		
	}
	public void display()
	{
		Node current=head;
		
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		System.out.println("nodes of double list: ");
		while(current !=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}

	}
	public static void main(String[] args)
	{
		LinkedListProgram9 lp=new LinkedListProgram9();
		lp.addNode(1);
		lp.addNode(3);
		lp.addNode(2);
		lp.addNode(4);
		
		
		lp.display();
	}
}