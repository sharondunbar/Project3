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
	 * @return the key value of the node
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * This method gets the value of the value
	 * @return the value of the node
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
	 * This method gets the next node
	 * @return the next node
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * This method sets the value of the next node
	 * @param n
	 */
	public void setNext(Node n) {
		next = n;
	}
	
	
	
//	/**
//	 * This method recursively checks to see if the map contains a key
//	 */
//	public boolean containsKey(String key) {
//		//Checks to see if this is the correct key
//		if(this.key == key)
//			return true;
//		
//		//Checks to see if there is another node after this
//		if(next != null) {
//			return next.containsKey(key);
//		}
//		return false;
//	}
//	
//	/**
//	 * This method recursively adds a key and value or rewrites the value of a key
//	 * @param key The key to this association
//     * @param val The value to which this key is associated
//	 */
//	public void put(String key, String val) {
//		//Checks to see if this is the correct key
//		if(this.key == key) {
//			this.value = val;
//		}
//		else if(next != null) {
//			next.put(key, val);
//		}
//		else {
//			next = new Node(key, val);
//		}
//	}
//	
//	/**
//	 * This method recursively finds a key to get its value
//	 * 
//	 */
//	public String get(String key) {
//		//Checks to see if this is the correct key
//		if(this.key == key) {
//			return this.value;
//		}
//		if(next != null) {
//			return next.get(key);
//		}
//		
//		return null;
//	}
//	
	
	
	/**
	 * Constructor.
	 * 
	 * @param k key for new node
	 * @param v value for new node
	 * @param n value referring to the next node
	 */
	Node(String k, String v, Node n){
		key = k;
		value = v;
		next = n;
		
	}

}
