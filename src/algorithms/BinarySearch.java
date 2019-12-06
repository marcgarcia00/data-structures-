package algorithms;

import auxillary.GenerateIntArray;
import auxillary.PrettyArray;

public class BinarySearch {
	
	public BinarySearch() {}
	
	public static int search(int [] arr, int target) {
		
		int lower = 0;
		int upper = arr.length - 1;
		
		while(lower <= upper) {
			int mid = lower + (upper - lower) / 2; 
			if(arr[mid] == target) return mid;
			if(arr[mid] > target) upper = mid - 1;
			else { lower = mid + 1; }
		}
		return -1;
	}
	public static void main(String [] args) {
		int [] arr = GenerateIntArray.generateSortedArray(10);
		PrettyArray.print(arr);
		int target = 5;
		int index = search(arr, target);
		System.out.println("\n\nIndex return::" + index);
	}
}
