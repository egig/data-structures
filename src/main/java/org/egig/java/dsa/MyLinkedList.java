package org.egig.java.dsa;

public class MyLinkedList {
	
	private static int counter;
	private Node head;
	
	private static int getCounter() {
		return counter;
	}
 
	private static void incrementCounter() {
		counter++;
	}
 
	private void decrementCounter() {
		counter--;
	}
	
	public int size() {
		return getCounter();
	}
	
	// Default Constructor
	public MyLinkedList(){
		
	}
	
	// Append element to the end
	public void add(Object data) {
		if(head == null) {
			head = new Node(data);
		}
		
		Node _tmp = new Node(data);
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = _tmp;
		
		incrementCounter();
	}
	
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
 
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;
 
		Node crunchifyCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getNext() == null)
					return false;
 
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
			crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
 
			// decrement the number of elements variable
			decrementCounter();
			return true;
 
		}
		return false;
	}
	
	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index <= 0)
			return null;
		Node crunchifyCurrent = null;
		if (head != null) {
			crunchifyCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getNext() == null)
					return null;
 
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
			return crunchifyCurrent.getData();
		}
		return crunchifyCurrent;
 
	}
	
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node crunchifyCurrent = head.getNext();
			while (crunchifyCurrent != null) {
				output += "[" + crunchifyCurrent.getData().toString() + "]";
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
 
		}
		return output;
	}
	
	public class Node {
		Node next;
		Object data;
		
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}
		
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
 
		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}
 
		public Node getNext() {
			return next;
		}
 
		public void setNext(Node nextValue) {
			next = nextValue;
		}
	}
}
