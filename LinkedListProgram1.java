package task4;

public class LinkedListProgram1
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next=null;
		}	
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		
		if(head == null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
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
		//System.out.println();
		while(current != null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args)
	{
		LinkedListProgram1 list=new LinkedListProgram1();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		
		
		list.display();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
