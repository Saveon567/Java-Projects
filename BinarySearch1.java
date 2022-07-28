package io.github.vikeshpandey.binarysearch;

public class BinarySearch1 {
	public static int binarySearch(int arr[], int first, int last, int key) {
		if(last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, first, mid - 1, key);
			} else {
				return binarySearch(arr, mid + 1, last, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int k = 2;
		int last = arr.length - 1;
		int result = binarySearch(arr, 0, last, k);
		if (result == -1)
			System.out.println("Element is not found");
		else
			System.out.println("Element is found at index: " + result);

	}
}
