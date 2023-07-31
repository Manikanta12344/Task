package task4;

public class LinkedListProgram6 
{
	static  LinkedList head;

	static class LinkedList
	{
		int val;
		LinkedList next;
		
		public LinkedList(int val)
		{
			this.val = val;
			this.next = null;
		}
	}
		
	LinkedList reverse(LinkedList node)
	{
		LinkedList previous=null;
		LinkedList curr=node;
		LinkedList next=null;
			
		while(curr != null)
		{
			next=curr.next;
			curr.next=previous;
			previous=curr;
			curr=next;	
		}
			
			node=previous;
			return node;
			
		}
		
		void printList(LinkedList node)
		{
			while(node!=null)
			{
				System.out.print(node.val+" ");
				node=node.next;
			}
		}
		
		public static void main(String[] args)
		{
			LinkedListProgram6 lst=new LinkedListProgram6();
			
			lst.head=new LinkedList(1);
			
			lst.head.next=new LinkedList(2);
			
			lst.head.next.next=new LinkedList(3);
			
			System.out.println("original list");
			
			lst.printList(head);
			
			System.out.println();
			
			head=lst.reverse(head);
			System.out.println("after reverse");
			lst.printList(head);
			
		}
		
		
}