package org.sortingalgos.insertionsort;

import java.util.Arrays;

import org.sortingalgos.CommonUtil;

public class InsertionSort {

	private int[] unsortedArray = new int[6];

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.readArray();
		insertionSort.insertionSort();
		insertionSort.displayArray();
	}

	private void readArray() {
		CommonUtil.readArray(unsortedArray);
	}

	private void insertionSort() {

		int[] sortedArray = new int[unsortedArray.length];
		sortedArray[0] = unsortedArray[0];

		boolean swapHappened = false;
		for (int i = 1; i < unsortedArray.length; i++) {
			swapHappened = false;
			for (int j = unsortedArray.length - 1; j >= 0; j--) {
				if (sortedArray[j] > 0) {
					if (sortedArray[j] > unsortedArray[i]) {
						sortedArray[j + 1] = sortedArray[j];
						sortedArray[j] = unsortedArray[i];
						swapHappened = true;
					}
				}
			}
			if (!swapHappened) {
				sortedArray[i] = unsortedArray[i];
			}
		}

		unsortedArray = Arrays.copyOf(sortedArray, sortedArray.length);

	}

	private void displayArray() {
		CommonUtil.displayArray(unsortedArray);
	}

}
