package io.github.vikeshpandey.bubblesort;

public class BubbleSort {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {289, 39, 48, 6, 28, 1, 2, 33};
		
		System.out.println("Array Before Bubble Sort");
		for(int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
