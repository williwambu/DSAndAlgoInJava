public class StackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	/**
	 * 
	 * @param max maximum number of items in the stack
	 */
	public StackX(int max){
		maxSize = max;
		stackArray = new char[maxSize];
		top = -1;
	}
	/**
	 * insert an item into the stack
	 * @param j
	 */
	public void push(char j){
		stackArray[++top] = j;
	}
	
	/**
	 *Take item from the top of the stack
	 * @return item at the top of the stack
	 */
	public char pop(){
		return stackArray[top--];
	}
	/**
	 * peek at the top of the stack
	 * @return item at top of the stack
	 */
	public char peek(){
		return stackArray[top];
	}
	/**
	 * 
	 * @return true if stack is empty false otherwise
	 */
	public boolean empty(){
		return (top == -1);
	}
}
