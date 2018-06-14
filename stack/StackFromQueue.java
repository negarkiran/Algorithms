import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueue {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	int curr_size =0;
	
	public StackFromQueue() {
		curr_size=0;
	}
	
	public void push(int item){
		curr_size++;
		q2.add(item);
		
		while(!q1.isEmpty()){
			q2.add(q1.peek());
			q1.remove();
		}
		
		Queue q = q1;
		q1=q2;
		q2=q;
	}
	
	public void pop(){
		if(q1.isEmpty())
			return;
		q1.remove();
		curr_size--;
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
		
		System.out.println("Current Size:"+stack.top());
	}

}
