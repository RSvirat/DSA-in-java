package Java8Features.FunctionalInterfacePrac;

public class SelectSorted {
	public static void main(String args[]) {
		int a[] = {3,4,2,5,1}; 
		insertionSort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void selectionSort(int a[]) {
		for(int i=0; i<a.length; i++){
			int minIndex = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[minIndex]) {
					minIndex = j;
				}
			}	
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}

	public static void bubbleSort(int a[]) {
		for(int i=1; i<a.length; i++) {
			boolean swap = false;
			for(int j=0; j<a.length-i; j++) {
				if(a[j]>a[j+1]) {
					swap = true;
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} else {
					break;
				}
			}
			if(!swap) {
				break;
			}
		}
	}

	public static void insertionSort(int a[]) {
		// outer loop for choose the number insert
		for(int i=1; i<a.length; i++) {
			for(int j=i; j>0; j--) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}
}