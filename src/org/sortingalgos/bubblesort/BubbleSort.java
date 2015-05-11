package org.sortingalgos.bubblesort;

import org.sortingalgos.CommonUtil;

/**
 * Created by ankitsh on 5/4/2015.
 */
public class BubbleSort {

	private int[] sortArray = new int[4];

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.readArray();
		bubbleSort.bubbleSort();
		bubbleSort.displayArray();
	}

	private void readArray() {
		CommonUtil.readArray(sortArray);
	}

	private void bubbleSort() {
		int swappingCounter = 0;
		int compareCounter = 0;
		int tempElement = 0;
		boolean isSorted = false;
		for (int j = sortArray.length-1; j <=0; j--) {
			isSorted = true;
			for (int i = 0; i < j; i++) {
				compareCounter++;
				if (sortArray[i + 1] < sortArray[i]) {
					tempElement = sortArray[i + 1];
					sortArray[i + 1] = sortArray[i];
					sortArray[i] = tempElement;
					swappingCounter++;
					isSorted = false;
				}
			}
			if(isSorted){
				break;
			}
			System.out.print("Pass "+(j+1)+" :: ");
			CommonUtil.displayArray(sortArray);
		}
		System.out.println("Swapping Counter :: "+swappingCounter);
		System.out.println("Compare Counter :: "+compareCounter);
		
	}

	private void displayArray() {
		CommonUtil.displayArray(sortArray);
	}
}
	