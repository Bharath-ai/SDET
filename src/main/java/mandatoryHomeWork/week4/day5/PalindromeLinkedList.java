package mandatoryHomeWork.week4.day5;


public class PalindromeLinkedList {
	
	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		LinkedList lsout=new LinkedList();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		lsout.start=new LinkedList().palidrome(ls.start);
	}
}

class LinkedList{
   class ListNode{       // Node creation
		String data;                  // create data
		ListNode next=null;	          // next pointer 
   }
   ListNode start=null;               // start should be null 
   ListNode tail=null;
   int size=0;                        // initial size =0
   
   void add(String data){                         // add method
	   ListNode node=new ListNode();              // to use data, object should be created for ListNode
			node.data = data;                     //using object data should be accessed
			//node.next = null; 
			if(start == null) {                  
				start=node;	
				tail=node;
		}
			else {
				ListNode current=start;
				while(current!=null) {
					current=current.next;
					tail=current.next;
				}
			}
			size++;
	}

public ListNode palidrome(ListNode start2) {
	
	return null;
}

}




