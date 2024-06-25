package Java8Features.FunctionalInterfacePrac;

import java.util.Arrays;

public class SampleProgram {
	public static void main(String args[]) {
		int[] a = {1,0,3,0,5,8,0,4};
		int temp = 0;
		
		for(int i=1; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]>a[i] && a[i] == 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
