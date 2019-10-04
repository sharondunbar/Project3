package hmllm;

import java.util.Iterator;

/**
 * MapIterator.java
 * 
 * This class iterates through the linked list map
 * 
 * @author sharondunbar
 *
 */
public class MapIterator implements Iterator<String> {

	/**
	 * This is the current node the iterator is on linked list map 
	 */
	private Node current;
	
	/**
	 * Returns true if there is another element in the map
	 */
	public boolean hasNext() {
		if(current == null)
			return false;
		if(current.getNext() != null)
			return true;
		return false;
	}

	/**
	 * Moves to the next element in the map
	 */
	public String next() {
		current = current.getNext();
		return current.getKey();
	}
	
	/**
	 * Constructor.
	 * 
	 * @param head This is the first node in the list
	 */
	MapIterator(Node head) {
		current = head;
	}

}
