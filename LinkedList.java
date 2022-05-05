class LinkedList{
	static LinkedListNode head;
	static class LinkedListNode{
		
		int data;
		LinkedListNode next;
	}          
	
	LinkedListNode(int d){
		this.data =d;
		next = null;
	}

}
LinkedListNode reverse(LinkedListNode node){
	LinkedListNode prev=null;
	LinkedListNode current =null;
	while(current != null){
		next= current.next;
		current.next=prev;
		prev = current;
		current = next;
	}
	node =prev;
	return node;
}
void printList(LinkedListNode node){
	while(node != null){
		System.out.print(node.data+" ");
	}
	node =node.next;
	}
}

public static void main(String[] args){
	
	LinkedList list =new LinkedList();
	list.head= new LinkedListNode(1);
	list.head.next= new LinkedListNode(2);
	list.head.next.next= new LinkedListNode(3);
	list.head.next.next.next= new LinkedListNode(4);
	list.head.next.next.next.next= new LinkedListNode(5);
	
	list.printList(head);
	
	head=list.reverse(head);
	list.printList(head);
}
	}
	