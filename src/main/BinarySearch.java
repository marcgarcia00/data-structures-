package main;

public class BinarySearch {
	
	public BinarySearch() {}
	
	public int BSearch(int [] arr, int target) {
		int lower = 0;
		int upper = arr.length - 1;
		
		while(lower <= upper) {
			int mid = lower + (upper - lower) / 2;
			
			if(arr[mid] == target) return mid;
			
			if(target < arr[mid]) upper = mid - 1;
			
			else { lower = mid + 1; }
		}
		return -1;
	}
}
