package main;
public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	
	private static class Node<T> {	
		public Node() {}
		public T value;
		public Node<T> next;
	}

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public LinkedList(T value) {
		head.value = value;
		tail.value = value;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean hasNext() {
		return head != null;
	}
	
	public int size() { return size; }
	
	public void add(T value) {
		
		// Empty list: set ead and tail to same value
		if(size == 0) {
			head = new Node<>();
			head.value = value;
			tail = head;
			size+=1;
			return;
		}
		
		// set a new value for tail. 
		if(size == 1) {
			tail = new Node<>();
			tail.value = value;
			head.next = tail;
			size+=1;
			return;
		}
		
		size += 1;
		Node<T> newLast = new Node<>();
		newLast.value = value;
		tail.next = newLast;
		tail = tail.next;
	}
	
	public void deleteFirst() {
		if(size == 0) { return; }

		if(size == 1) {
			head = null;
			tail = null;
			size = 0;
			return;
		}
		
		size -= 1;
		head = head.next;
	}
	
	// Checks if list contains certain value
	public boolean contains(T value) {
		Node<T> copy = head;
		while(copy != null) {
			if(copy.value == value) return true;
			copy = copy.next;
		}
		return false;
	}
	
	public void deleteAt(int index) {
		int position = 0;
		while(position < index) {
			if(position == index -1) {
				head.next = head.next.next;
			}
			
		}
	}
	
	// Returns String value of list
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> copy = head;
		while(copy != null) {
			sb.append(copy.value);
			copy = copy.next;
		}
		return sb.toString();
		
	}
}


