package prob5;

public class MyStack {

	private int top = -1;
	private String[] buffer;
	
	
	public MyStack(int size) {
		this.buffer = new String[size+2];
	}
	
	public MyStack() {
		this.buffer = new String[2];
	}

	public void push(String data) {
		buffer[++top] = data;
	}
	
	public boolean isEmpty() {
		if(top < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String pop() throws MyStackException {
		if(top < 0) { 
			return "stack is empty!";
		}
		else {
			return buffer[top--];
		}
	}

	
}