/**
 * 
 * @author william
 *
 */
public class QueueApp {

	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		
		//insert 4 items
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		
		//remove 3 items 10, 20, 30
		theQueue.remove();
		theQueue.remove();
		theQueue.remove();
		
		//insert 4 more items
		theQueue.insert(50);
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
		while(!theQueue.isEmpty()){
			int n = theQueue.remove();
			
			System.out.print(n);
			
			System.out.print(" ");
		}
	}

}
