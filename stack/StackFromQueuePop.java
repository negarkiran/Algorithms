import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueuePop {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	int curr_size =0;
	
	public StackFromQueuePop() {
		curr_size=0;
	}
	
	public void push(int item){
		q1.add(item);
		curr_size++;
	}
	
	public void pop(){
		
		if(q1.isEmpty())
			return;
		
		while(q1.size() !=1){
			q2.add(q1.remove());
		}
		
		q1.remove();
		curr_size--;
		
		Queue q = q1;
		q1=q2;
		q2=q;
	}
	
	public int top(){
		if(q1.isEmpty())
			return -1;
		return q1.peek();
	}
	
	public int size(){
		return curr_size;
	}
	
	
	public static void main(String[] args) {

		StackFromQueue stack = new StackFromQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Current Size:"+stack.size());
		
		System.out.println("Current Top:"+stack.top());
		
		stack.pop();
		
		System.out.println("Current Top:"+stack.top());
		
		stack.pop();
		
		System.out.println("Current Top:"+stack.top());
	}
}

