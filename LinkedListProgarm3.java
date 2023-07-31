package task4;
public class LinkedListProgarm3 
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
	
	public void sortList()
	{
		Node current=head,index=null;
		int temp;
		
		
		if(head==null)
		{
			return;
		}
		
		
		else
		{
			while(current !=null)
			{
				index=current.next;
				
				while(index!=null)
				{
					if(current.data>index.data)
					{
						temp=current.data;
						current.data=index.data;
						index.data=temp;
					}
					index=index.next;
				}
				
				current=current.next;
				
			}
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
		
		while(current != null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args)
	{
		LinkedListProgarm3 list=new LinkedListProgarm3();
		list.addNode(1);
		list.addNode(3);
		list.addNode(4);
		list.addNode(2);
		
		
		System.out.println("list :");
		list.display();
		
		list.sortList();
		System.out.println("after sorted");
	
		list.display();	
	
	}

}
