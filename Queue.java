/*
 * Implementing queue data structure
 */
public class Queue {
	private int maxSize;
	private int[] queArray;
	private int rear;
	private int front;
	private int nItems;
	
	/**
	 * constructor
	 * @param s the maximum size of the queue
	 */
	public Queue(int s){
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	/**
	 * put an item at the end/rear of the queue
	 */
	public void insert(int j){
		if(rear == maxSize - 1){ //deal with wraparound
			rear = -1;
		}
		queArray[++rear] = j;
		
		nItems++;
	}
	
	/**
	 * Take item from the front of the queue and remove it from the queue
	 * @return item at the front of the queue
	 */
	public int remove(){
		int temp = queArray[front++]; // get value and increment front
		if(front == maxSize) //deal with wraparound
			front = 0;
		nItems--;
		return temp;
	}
	
	/**
	 * peek at the front of the queue
	 * @return item at the front of the queue
	 */
	public int peekFront(){
		return queArray[front];
	}
	
	/**
	 * check if the queue is empty
	 * @return true if empty false otherwise
	 */
	public boolean isEmpty(){
		return (nItems == 0);
	}
	/**
	 * checks if the queue is full
	 * @return true if full false if otherwise
	 */
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	/**
	 * number of items it the queue
	 * @return size of the queue
	 */
	public int size(){
		return nItems;
	}
	
	
}
