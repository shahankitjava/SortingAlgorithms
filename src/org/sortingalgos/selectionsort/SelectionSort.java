package org.sortingalgos.selectionsort;

import org.sortingalgos.CommonUtil;

public class SelectionSort {

	private int[] sortArray = new int[6];

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.readArray();
		selectionSort.sortArray();
		selectionSort.displayArray();
	}

	private void readArray() {
		CommonUtil.readArray(sortArray);
	}

	private void sortArray() {
		
		int swappingCounter = 0;
		int compareCounter = 0;

		for (int i = 0; i < sortArray.length; i++) {
			int currentMinimum = sortArray[i];
			int swapIndex = 0;
			for (int j = i + 1; j < sortArray.length; j++) {
				compareCounter++;
				if (sortArray[j] < currentMinimum) {
					currentMinimum = sortArray[j];
					swapIndex = j;
					swappingCounter++;
				}
			}
			if (swapIndex != 0) {
				sortArray[swapIndex] = sortArray[i];
				sortArray[i] = currentMinimum;
			}
			
			System.out.print("Pass "+(i+1)+" :: ");
			CommonUtil.displayArray(sortArray);
		}
		System.out.println("Swapping Counter :: "+swappingCounter);
		System.out.println("Compare Counter :: "+compareCounter);
	}

	private void displayArray() {
		CommonUtil.displayArray(sortArray);
	}

}