package week5.day1;

public class MiddleLL {
     public static void main(String[] args) {
    	 LinkedList linkedlist=new LinkedList();
    	 linkedlist.add(1);
    	 linkedlist.add(2);
    	 linkedlist.add(3);
    	 linkedlist.add(4);
    	 linkedlist.add(5);
    	 System.out.println(linkedlist);
    	 linkedlist.start=new LinkedList().MiddleLL(linkedlist.start);
    	 linkedlist.display();
     }
}

class LinkedList{
class Node{
	int data;
	Node next;
}

   Node start=null;
   int size=0;
   Node firstpointer;
   Node secondpointer;
  // Node end=null;
   
   void add(int data) {
	   Node node=new Node();
	   node.data=data;
	   if(start==null) {
		   start=node;
		//   end=node;
	   }
	   else {
		   Node current=start;
		   while(current.next!=null) {
			   current=current.next;
		   }
		   current.next=node;
	   }
	   size++;
   }
   
   public Node MiddleLL(Node start) {
		/*
		 * //int x=6; int n; if(size%2 !=0) { n=size/2; System.out.println(n); int
		 * position=n; while() } else { n=size/2; n=n+1; System.out.println(n); }
		 */
	  // Node node=new Node();
	   firstpointer=start;
	   secondpointer=start;
	   while(firstpointer.next !=null && secondpointer.next!=null) {
		   firstpointer=firstpointer.next;
		   secondpointer=secondpointer.next.next;
	   }
	  // System.out.print(firstpointer);
	   return firstpointer;
}
 
public String display() {
	   StringBuffer sb=new StringBuffer();
	   sb.append("[");
	   Node current=firstpointer;
	   while(current!=null) {
		   sb.append(current.data +", ");
		   current=current.next;
	   }
	   sb.append("]");
	   return sb.toString();
   }
   
   
   
@Override   
   public String toString() {
	   StringBuffer sb=new StringBuffer();
	   sb.append("[");
	   Node current=start;
	   while(current!=null) {
		   sb.append(current.data+" ,");
		   current=current.next;
	   }
	   sb.append("]" + "---->" +size);
	   return sb.toString();
   }
}