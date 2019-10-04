package hmllm;

import java.util.Iterator;

/**
 * HomemadeLLMap
 * 
 * An implementation of the HomemadeMap class that uses
 * a completely-homemade linked list on the inside.
 * 
 * @author Thomas VanDrunen
 * CSCI 245, Wheaton College
 * June 30, 2014
 */

public class HomemadeLLMap implements HomemadeMap {

	/**
	 * This node represents the beginning of the linked list
	 */
	private Node head = null;

	
    /**
     * Test whether an association exists for this key.
     * @param key The key to remove
     * @return true if there is an association for this key, false otherwise
     */
    public boolean containsKey(String key) {
    	
    	//Checks to make sure that the list isn't null, then
    	if(head == null)
    		return false;
    	
    	return head.containsKey(key);
    
    }

    /**
     * Add an association to the map.
     * @param key The key to this association
     * @param val The value to which this key is associated
     */
    public void put(String key, String val) {
    	if(head == null) {
    		head = new Node(key, val);
    	} 
    	else {
    		head.put(key, val);
    	}
    }  

    /**
     * Get the value for a key.
     * @param key The key whose value we're retrieving.
     * @return The value associated with this key, null if none exists
     */
    public String get(String key) {
    	if(head == null) {
    		return null;
    	}
    	if(head.getKey() == key) {
    		return head.getValue();
    	}
    	return head.get(key);
    }

    /**
     * Get an iterator for all the keys in this map.
     * @return An iterator over the set of keys.
     */
    public Iterator<String> keyIterator() {
    	return new MapIterator(head);
    }

    
    /**
     * Remove the association for this key.
     * @param key The key to remove
     */   
    public void remove(String key) {
    	if(head == null || ! head.containsKey(key))
    		return;
    	
    	if(head.getKey() == key) {
    		head = head.getNext();
    		return;
    	}
    	
    	head.remove(key);
    }


	
}
