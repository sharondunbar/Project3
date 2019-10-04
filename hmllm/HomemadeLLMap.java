package hmllm;

import java.util.Iterator;

//Modified by Sharon Dunbar

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
	 * This node moves down the list as the iterative functions work
	 */
	private Node current;

	
    /**
     * Test whether an association exists for this key.
     * @param key The key to remove
     * @return true if there is an association for this key, false otherwise
     */
    public boolean containsKey(String key) {
    	current = head;
    	
    	//Checks to make sure that the list isn't null
    	if(head == null)
    		return false;
    	
    	while(current.getNext() != null) {
    		if(current.getKey() == key) {
    			return true;
    		}
    		current = current.getNext();
    	}
    	
    	return false;
    }

    /**
     * Add an association to the map.
     * @param key The key to this association
     * @param val The value to which this key is associated
     */
    public void put(String key, String val) {
    	current = head;
    	
    	//Checks to see if the list is empty
    	if(head == null) {
    		head = new Node(key, val, head);
    		return;
    	} 
    	
    	while(current.getNext() != null) {
       		if(current.getKey() == key) {
       			current.setValue(val);
       			return;
       		}
       		current = current.getNext();
       		
   		}	
    	
    	current.setNext(new Node(key, val, null));
    }  

    /**
     * Get the value for a key.
     * @param key The key whose value we're retrieving.
     * @return The value associated with this key, null if none exists
     */
    public String get(String key) {
    	return null;
    	
    }

    /**
     * Get an iterator for all the keys in this map.
     * @return An iterator over the set of keys.
     */
    public Iterator<String> keyIterator() {
    	return null;
    }

    
    /**
     * Remove the association for this key.
     * @param key The key to remove
     */   
    public void remove(String key) {
    }


	
}
