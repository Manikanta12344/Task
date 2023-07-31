package task4;


public class LinkedListProgram8 
{
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next =null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void add(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
			
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
		else
		{
			
		System.out.println("nodes of circular list: ");
		do
		{
			System.out.print(" "+ current.data); 
			current=current.next;
		}
		while(current !=head);
		System.out.println();
	}
	
}
	public static void main(String[] args)
	{
		LinkedListProgram8 lp=new LinkedListProgram8();
		lp.add(1);
		lp.add(3);
		lp.add(2);
		lp.add(4);
		
		lp.display();
	}
}
	
	
