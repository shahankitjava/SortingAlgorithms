package org.sortingalgos.insertionsort;

import org.sortingalgos.CommonUtil;

public class InsertionSort {

	private int[] sortArray = new int[6];
	
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.readArray();
		insertionSort.insertionSort();
		insertionSort.displayArray();
	}

	private void readArray() {
		CommonUtil.readArray(sortArray);
	}

	private void insertionSort() {
		
	}

	private void displayArray() {
		CommonUtil.displayArray(sortArray);
	}

}
