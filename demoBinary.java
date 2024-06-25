class BinarySearch {
	public static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean asc = false;

		if(arr[start]<arr[end])
			asc = true;
		while(start <= end) {
			int mid = (start+end)/2;
			if(asc) {
				if(target>arr[mid]) {// focus on right side
					start = mid + 1;
				} else if(target<arr[mid]) { // focus on left side
					end = mid - 1;
				} else {
					return mid;
				}

			} else {
				if(target>arr[mid]) { // focus on left side
					end = mid - 1;
				} else if(target<arr[mid]) { // focus on right side
					start = mid + 1;
				} else {
					return mid;
				}				
			}
		}
		return -1;

	}
}

public class demoBinary {
	public static void main(String args[]) {
		int a[] = {1,2,3,6,7,8,9,12,13,15,19,20};
		int b[] = {20,19,15,13,12,9,8,7,6,3,2,1};
		System.out.println(BinarySearch.search(a, 12));
		System.out.println(BinarySearch.search(b, 12));	
	}
}