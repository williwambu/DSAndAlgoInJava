/**
 * Priority queue implementation
 * Smaller items are at the top of the queue
 * @author william
 *
 */
public class PriorityQ {
	private int maxSize;
	private double[] queArray;
	private int nItems;
	
	public PriorityQ(int s){
		maxSize = s;
		queArray = new double[maxSize];
		nItems = 0;
	}
	/**
	 * insert an item into the priority queue
	 * @param item item to be inserted
	 */
	public void insert(double item){
		int j;
		
		if(nItems == 0){ //if no items
			queArray[nItems] = item; // insert at nItems = 0
			nItems++; //increment by 1
		}
		else{
			for(j = nItems - 1; j >= 0; j--){
				if(item > queArray[j]) // if the new item is larger
					queArray[j+1] = queArray[j]; //shift upward
				else
					break; 
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	/**
	 * remove min item
	 * @return min item
	 */
	public double remove(){
		return queArray[--nItems];
	}
	
	
	/**
	 * peek at minimum item
	 * @return minimum item inthe priority queue
	 */
	public double peekMin(){
		return queArray[nItems - 1];
	}
	
	/**
	 * checks if the priority Queue is empty
	 * @return true if empty false if otherwise
	 */
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	
}
