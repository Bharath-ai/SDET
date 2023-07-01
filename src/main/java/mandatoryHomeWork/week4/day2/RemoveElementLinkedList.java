 package Week4.day2;
 /* //import week4Day2.LinkedList.Node;
 * 
 * public class RemoveElementLinkedList { public static void main(String[] args)
 * { LinkedList ll=new LinkedList(); int val=3; for(int each:new int[]
 * {1,2,3,4,3}) { ll.add(each); } System.out.print(ll); ll.head=new
 * LinkedList().RemoveElement(ll.head, val); //System.out.print(ll); } }
 * 
 * class LinkedList{
 * 
 * class Node{ int data; Node next=null; }
 * 
 * Node head=null;
 * 
 * void add(int data) { Node node=new Node(); node.data=data; if(head==null) {
 * head=node; } else { Node current=head; while(current.next!=null) {
 * current=current.next; } current.next=node; } }
 * 
 * 
 * Node RemoveElement(Node head, int val) { if(head==null) {
 * System.out.print("empty list"); }
 * 
 * while(head.next!=null) { if(head.data==val) { head.next=head.next.next; } }
 * // System.out.print("hi"); return head;
 * 
 * }
 * 
 * 
 * 
 * @Override public String toString() { StringBuffer sb=new StringBuffer();
 * sb.append("["); Node current = head; while(current!=null) {
 * sb.append(current.data+","); current=current.next; } sb.append("]"); return
 * sb.toString(); }
 * 
 * }
 */
 import java.util.*;
 public class RemoveElementLinkedList{
	 public static void main(String[] args) {
		 LinkedList<String> l=new LinkedList<String>();
		 l.add("1");
		 l.add("2");
		 l.add("3");
		 l.add("4");
		 l.add("3");
		 System.out.print("linkedlist - "+l);
		 for(int i=0;i<l.size();i++) {
		 l.remove("3");
		 }
		 System.out.println("linkedlist after remove element - "+l);
	 }
 }
 
 