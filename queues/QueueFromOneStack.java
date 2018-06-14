import java.util.Stack;

public class QueueFromOneStack {

	static class Queue{
		Stack<Integer> stack1;
		
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
		if(q.stack1.isEmpty() ){
			System.out.println("Queue is Empty");
			System.exit(0);
		}else if(q.stack1.size() ==1){
			return q.stack1.pop();
		}else{
			int x = pop(q.stack1);
			
			int res = deQueue(q);
			
			push(q.stack1, x);
			return res;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.stack1= new Stack<Integer>();
		
		enQueue(queue, 1);
		enQueue(queue, 2);
		enQueue(queue, 3);
		enQueue(queue, 4);
		
		System.out.println(queue.stack1);
		
		System.out.println("Dequeued item:"+deQueue(queue));
		System.out.println("Dequeued item:"+deQueue(queue));
		
		System.out.println("Dequeued item:"+deQueue(queue));
		
	}

}
