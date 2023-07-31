package task4;


public class LinkedListProgram4 
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
	
	public void minNode()
	{
		Node current=head;		
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		else
		{
			int min=head.data;
			while(current != null)
			{
				if(min>current.data)
				{
					min=current.data;
				}
				current=current.next;
			}
		
			System.out.println("min node"+min);
		}
	}
	
	
	public void maxNode()
	{
		Node current=head;		
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		else
		{
			int max=head.data;
			while(current != null)
			{
				if(max<current.data)
				{
					max=current.data;
				}
				current=current.next;
			}
		
			System.out.println("max node"+max);
		}
		
	}
	
	public static void main(String[] args)
	{
		LinkedListProgram4 list=new LinkedListProgram4();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		list.minNode();
		
		list.maxNode();
		
		
		
	}
	
}
