package org.sortingalgos.insertionsort;

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

		for (int i = 1; i < unsortedArray.length; i++) {
			int key = unsortedArray[i];
			int j = i - 1;
			while (j >= 0 && unsortedArray[j] > key) {
				unsortedArray[j + 1] = unsortedArray[j];
				j = j - 1;
			}
			unsortedArray[j + 1] = key;
		}

	}

	private void displayArray() {
		CommonUtil.displayArray(unsortedArray);
	}

}