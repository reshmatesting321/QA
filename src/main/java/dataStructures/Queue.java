package dataStructures;

public class Queue {
	
	private int[] object;
	private int front;
	private int rear;
	private int queueSize;
	
	public Queue() {
		
		queueSize = 3;
		object = new int[queueSize];
		front = -1;
		rear = -1;
		
	}
	
	public void push(int data) {
		
		if( (front + 1) >= queueSize) {
			
			resize();
		}
		
		object[++front] = data;
	}
	
	public Integer pop() {
		
		if (front > rear)
			return object[++rear];
		
		return null;
		
	}
		
		public boolean isEmpty() {
			
			return front <= rear;
			
		}
		
		public void resize() {
			int[] temp = object;
			queueSize = queueSize * 2;
			object = new int[queueSize];
			
			for( int i = 0; i <= front; i++)
				object[i] = temp[i];			
		
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.push(6);
		queue.push(7);
		queue.push(-1);
		System.out.println(queue.pop());
		queue.push(21);
		queue.push(-5);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
		System.out.println(queue.pop());
		System.out.println(queue.pop());

	}

}
