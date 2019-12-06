package auxillary;

public class PrettyArray {

	public PrettyArray() {}
	
	public static void print(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) { System.out.printf("%2d", i); continue; }
			System.out.printf("%5d", i);
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) { System.out.printf("[%d", arr[i]); continue; }
			if(i == arr.length - 1) { 
				System.out.printf("%5d]", arr[i]);
				return;
			}
			System.out.printf("%5d", arr[i]);
		}
	}
}
