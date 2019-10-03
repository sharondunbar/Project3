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
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * This method gets the value of the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * This method sets the value of the value
	 * @param v
	 */
	public void setValue(String v) {
		value = v;
	}
	
	/**
	 * This method recursively checks to see if the map contains a key
	 * @param key The key to this association
	 */
	public boolean containsKey(String key) {
		//Checks to see if this is the correct key
		if(findKey(key) != null)
			return true;
		
		return false;
	}
	
	/**
	 * This method recursively adds a key and value or rewrites a key's value
	 * @param key The key to this association
     * @param val The value to which this key is associated
	 */
	public void put(String key, String val) {
		//Checks to see if this is the correct key
		if(findKey(key) != null) {
			Node node = findKey(key);
			node.setValue(val);
		}
		else {
			//Something to add next node to the end
		}
	}
	
	/**
	 * This method recursively finds a key to get its value
	 * @param key The key to this association
	 */
	public String get(String key) {
		return findKey(key).getKey();
	}
	
	/**
	 * This is a helper method to find a particular key and return its node
	 * @param key The key to find a node for
	 */
	private Node findKey(String key) {
		if(this.key == key) {
			return this;
		}
		if(next != null) {
			return next.findKey(key);
		}
		return null;
		
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
