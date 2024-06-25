import java.util.*;

class LinearSearch {
	public static int find(int a[], int target) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean stringContains(String name, char target) {
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) == target) {
				return true;
			}
		}
		return false;
	}

	public static int[] find(int a[][], int target) {
		for(int row=0; row<a.length; row++) {
			for(int col=0;col<a[row].length; col++) {
				if(a[row][col] == target) {
					return new int[]{row,col};
				}
			}
		}
		return new int[] {-1,-1};

	}
}

public class demoLinear {
	public static void main(String args[]) {
		int a[] = {1,5,2,60,12,56};
		String name = "sudhakar";
		int result = LinearSearch.find(a, 5);
		if(result != -1) {
			System.out.println("value is there");
		} else {
			System.out.println("value is not there");
		}
		System.out.println(LinearSearch.stringContains(name, 'a'));
		int arr[][] = {
				{2,3,4},
				{5,3,7},
				{2,18,29}	
			};
		int r[] = LinearSearch.find(arr, 7);
		System.out.println(Arrays.toString(r)); 
	}
}