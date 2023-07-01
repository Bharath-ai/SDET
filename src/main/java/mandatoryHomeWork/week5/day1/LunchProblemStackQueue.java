package week5.day1;


public class LunchProblemStackQueue {
     public static void main(String[] args) {
    	 Stack sandwich=new Stack();
    	 Queue student=new Queue();
    	 sandwich.push(1);
    	 sandwich.push(0);
    	 sandwich.push(0);
    	 sandwich.push(0);
       	 System.out.println(sandwich);
       	 student.enqueue(1);
       	 student.enqueue(1);
       	 student.enqueue(0);
       	 student.enqueue(0);
       	 System.out.println(student);
       //	 student.start=new Queue().display(student);
       	 lunchProblem(sandwich, student);
     }

	private static void lunchProblem(Stack sandwich, Queue student) {
		
		
	}

	
}


class Stack{
	int size=50;
	int top=0;
	Integer stack[]=new Integer[50];

    void push(Integer element) {
    	if(top<size) {
    		stack[top]=element;
    		top++;
    	}
    	
    }
    
    int getsize() {
		return top;
	}
        
    public String toString() {
    	
    	StringBuffer sb=new StringBuffer();
    	sb.append("[");
		/*
		 * for (int i = 0; i < top; i ++) { sb.append(stack[i] + ", "); }
		 */
    	while(top!=0) {
    		sb.append(stack[top-1]+",");
    		top--;
    	}
    	sb.append("]");
    	return sb.toString();
    }
    
}

class Queue{
	class Node{
		int number;
		Node next=null;
	}
	Node start=null;
	Node end=null;
	
	void enqueue(int no) {
		Node node=new Node();
		node.number=no;
		if(start==null) {
			start=node;
			end=node;
		}
		else {
			end.next=node;
			end=node;
		}
	}

	public String toString() {
		//List<String> ls=new ArrayList<>();
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		Node current=start;
		while(current!=null) {
			sb.append(current.number+",");
			current=current.next;
		}
		sb.append("]");
		return sb.toString();
		
	}
}