package main;

@SuppressWarnings("unchecked")
public class ArrayList<T> {

	private static final int DEFAULT_CAPACITY = 10;
	private T[] collection;
	private int size = 0;
	
	
	public ArrayList() {
		collection = (T[]) new Object[DEFAULT_CAPACITY];
	}

	public ArrayList(T value) {
		collection = (T[]) new Object[DEFAULT_CAPACITY];
		collection[0] = value;
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isFull() {
		if (size == collection.length) return true;
		return false;
	}
	
	public boolean isHalfOccupied() {
		if(size < collection.length /2) return true;
		return false;
	}
	
	//check bounds auxillary method

	public void addAtIndex(T item, int index) {
		//out of bounds check
		if (index < 0 || index > size  + 1) { return; }
		
		//Check if array is full before adding
		if (isFull()) {
			resizeLarger();
		}
		
		size+=1;
		int currentIndex = 0;
		T[] newArray = (T[]) new Object[size];
		for(int i = 0; i < size; i++) {
			if(index == i) {
				newArray[currentIndex] = item;
				++currentIndex;
				newArray[currentIndex] = collection[i];
				continue;
			}
			currentIndex++;
			newArray[i] = collection[i];
		}
		
	}

	public void delete(int target) {

		//index out of bounds
		if(target < 0 || target > size) { return; }
		if(isHalfOccupied()) { resizeSmaller(); }
		
		T [] newArray = (T[]) new Object[target];
		int currentIndex = 0;
		for (int i = 0; i < target; i++) {
			if(i == target) { continue; }
			
			newArray[currentIndex] = collection[i];
			currentIndex++;
		}
		size -= 1;
	}
	
//	public void delete(T item) {
//		T [] newArray = (T[]) new Object[size];
//		if(isHalfOccupied()) { resizeSmaller(); }
//		for(int i = 0; i < size; i++) {
//			if()
//		}
//	}

	public void append(T item) {
		if (isFull()) {
			resizeLarger();
		}
		collection[size] = item;
		size++;
	}

	public void resizeLarger() {
		T[] newArray = (T[]) new Object[collection.length + 10];
		for (int i = 0; i < collection.length; i++) {
			newArray[i] = collection[i];
		}
		collection = newArray;
	}
	
	public void resizeSmaller() {
		T[] newArray = (T[]) new Object[collection.length / 2];
		for (int i = 0; i < collection.length; i++) {
			newArray[i] = collection[i];
		}
		collection = newArray;
	}
	
	public void printArray() {
		for(int i = 0; i < size; i++) {
			System.out.print(collection[i]+ " ");
		}
		System.out.println();
	}
}
