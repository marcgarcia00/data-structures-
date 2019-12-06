package auxillary;

import java.util.Arrays;
import java.util.Random;

public class GenerateIntArray {
	private static int [] arr;
	
	public GenerateIntArray() {}
	
	public static int [] generateArray(int size) {
		arr = new int[size];
		Random rand = new Random();
		for(int i = 0; i < size; i ++) {
			arr[i] = rand.nextInt(10);
		}
		return arr;
	}
	
	public static int [] generateSortedArray(int size) {
		generateArray(size);
		Arrays.sort(arr);
		return arr;
	}
}
