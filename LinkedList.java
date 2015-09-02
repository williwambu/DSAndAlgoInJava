/**
 * 
 * implementing a LinkedList
 * @author william
 *
 */

class Link{
	public int iData; //data item
	public double dData; //data item
	public Link next; //next link in the list
	
	public Link(int id, double dd){
		iData = id;
		dData = dd;
	}
	
	public void displayLink(){
		System.out.println("{" + iData + ", " + dData + "}");
	}
}

public class LinkedList {
	private Link first; //first link in the list
	
	public LinkedList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void insertFirst(int id,double dd){
		Link newLink = new Link(id,dd);
		
		newLink.next = first; // newLink points to old first
		first = newLink; // 
	}
	
	public Link deleteFirst(){
		Link temp =first;
		first = first.next;
		return temp;
	}
	
	public void displayList(){
		System.out.println("First ---> Last");
		
		Link current = first;
		
		while(current != null){
			current.displayLink();
			
			current = current.next;
		}
		
		System.out.println("");
	}
	
	public Link find(int key){
		Link current = first;
		
		while(current.iData != key){
			if(current.next == null){
				return null;
			}else{
				current = current.next;
			}
		}
		
		return current;
	}
	
	public Link delete(int key){
		Link current = first;
		Link previous = first;
		
		while(current.iData != key){
			if(current.next == null){
				return null;
			}else{
				previous = current;
				current = current.next;
			}			
		}
		if(current == first)
			first = first.next;
		previous.next = current.next;
		
		return current;
	}
}



