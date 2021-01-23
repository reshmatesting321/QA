package dataStructures;
public class StackUsingArrays {
	String s[];
	int maxSize;
	int top;	
	public StackUsingArrays(int n)
	{
		maxSize = n;
		s = new String[maxSize];
		top = 0;
	}
	public boolean isEmpty(){
		if(top == 0) {			
			return true;
			
		} else {			
			return false;			
		}			
	}	
	public void push(String str) {		
		if(top < maxSize ) {			
			s[top] = str;		
			top ++;	
			System.out.println("the element pused : "+ str);			
		} else {			
			System.out.println( " Stack Overflow ");			
		}		
	}	
	public String pop() {		
		if(!this.isEmpty()) {			
			String temp = this.peek();
			s[top - 1] = null;
			top--;
			for(int i = 0; i < top ;i++){
				System.out.println(s[i]);
			}	
			return temp;			
		} else {			
			return null;			
		}}
	public String peek() {		
		if(top > 0) {			
			return s[top - 1];			
		} else {			
			return null;			
		}}	
	public static void main(String[] args) {
		StackUsingArrays stack=new StackUsingArrays(4);		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5"); //Stack overflow error		
		System.out.println("The remaing elements after popup: ");
		String popped = stack.pop();		
		System.out.println("The latest popped element is " + popped);		
		String peek = stack.peek();
		System.out.println("The top of the element is: " + peek);		
	}
}
