package prob5;

public class MyStack {

	private int top = -1;
	private String[] buffer;
	
	public MyStack() {}
	
	public MyStack(int size) {
		buffer = new String[size];
	}

	public void push(String data) {
		
		String[] temp = buffer;
		
		if(top >= buffer.length-1) {
			buffer =  new String[top+2];
			
			for(int i=0; i<temp.length; i++) {
				buffer[i] = temp[i]; 
			}
		}
		
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
		String data;
		
		if(top < 0) { 
			throw new MyStackException("stack is empty!");
		}
		
		else {
			data = buffer[top];
			buffer[top--] = null;
			return data;
		}
	}

	
}