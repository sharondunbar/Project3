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
	 * Checks to see if there is another element in the map
	 * @return true if there is another element after this one
	 */
	public boolean hasNext() {
		if(current == null)
			return false;
		
		return true;
	}

	/**
	 * Gives the next key value in the map
	 * @return the next key
	 */
	public String next() {
		String key = current.getKey();
		current = current.getNext();
		return key;
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
