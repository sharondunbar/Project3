package hmllm;

/**
 * Node.java
 * 
 * This class represents a node of a linked list
 * 
 * @author sharondunbar
 *
 */
public class Node {
	
	/**
	 * This string holds the key's value
	 */
	private String key;
	
	/**
	 * This string holds the value's value
	 */
	private String value;
	
	/**
	 * This is a reference to the next node
	 */
	private Node next;
	
	
	/**
	 * This method gets the value of the key
	 * @return String the key
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * This method gets the value of the value
	 * @return String the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * This method sets the value of the value
	 * @param v The value to be set
	 */
	public void setValue(String v) {
		value = v;
	}
	
	/**
	 * This method gets the next node
	 * @return Node The next node
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * This method recursively checks to see if the map contains a key
	 * @return boolean true if the key exists
	 */
	public boolean containsKey(String key) {
		//Checks to see if this is the correct key
		if(this.key.equals(key))
			return true;
		
		//Checks to see if there is another node after this and passes call on if there is
		if(next != null) {
			return next.containsKey(key);
		}
		return false;
	}
	
	/**
	 * This method recursively adds a key and value or rewrites the value of a key
	 * @param key The key to this association
     * @param val The value to which this key is associated
	 */
	public void put(String key, String val) {
		//Checks to see if this is the correct key
		if(this.key.equals(key)) {
			this.value = val;
		}
		//Passes on recursive call
		else if(next != null) {
			next.put(key, val);
		}
		//Adds new node if the key isn't found by the end
		else {
			next = new Node(key, val);
		}
	}
	
	/**
	 * This method recursively finds a key to get its value
	 * @param key The key it is looking for
	 * @return String The value associated with the key
	 */
	public String get(String key) {
		//Checks to see if this is the correct key
		if(this.key.equals(key)) {
			return this.value;
		}
		//Checks to see if there is another node and passes call if there is
		if(next != null) {
			return next.get(key);
		}
		
		return null;
	}
	
	/** 
	 * This method recursively checks to see if this is the right node to remove and removes if so
	 * @param key The key it is looking for
	 */
	public void remove(String key) {
		//Checks to see if the next node has the correct key, snips if it does
		if(next.getKey().equals(key)) {
			next = next.getNext();
			return;
		}
		next.remove(key);
	}
	
	
	/**
	 * Constructor.
	 * 
	 * @param k key for new node
	 * @param v value for new node
	 */
	Node(String k, String v){
		key = k;
		value = v;
	}

}
