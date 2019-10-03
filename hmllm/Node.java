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
	
	

}
