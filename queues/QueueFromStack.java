import java.util.Stack;

public class QueueFromStack {

	static class Queue{
		Stack<Integer> stack1;
		Stack<Integer> stack2;
		
	}
	
	public static void push(Stack<Integer> ref,int item){
		ref.push(item);
	}
	
	public static int pop(Stack<Integer> ref){
		if(ref.isEmpty()){
			System.out.println("Stack Overflow");
			System.exit(0);
		}
		return ref.pop();
	}
	
	public static void enQueue(Queue q,int item){
		push(q.stack1,item);
	}
	
	public static int deQueue(Queue q){
		if(q.stack1.isEmpty() && q.stack2.isEmpty()){
			System.out.println("Queue is Empty");
			System.exit(0);
		}
		
		if(q.stack2.isEmpty()){
			while(!q.stack1.isEmpty()){
				push(q.stack2,q.stack1.pop());
			}
		}
		
		return pop(q.stack2);
		
	}
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.stack1= new Stack<Integer>();
		queue.stack2= new Stack<Integer>();
		
		enQueue(queue, 1);
		enQueue(queue, 2);
		enQueue(queue, 3);
		
		System.out.println("Dequeued item:"+deQueue(queue));
		System.out.println("Dequeued item:"+deQueue(queue));
		
	}

}
