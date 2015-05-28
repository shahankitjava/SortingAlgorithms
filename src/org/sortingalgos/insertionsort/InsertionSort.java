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
		
		
/*		UA - 3 2 5 1 6 4
		SA - 0 0 0 0 0 0
		------------------------
		Step 1
		UA - 3 2 5 1 6 4
		SA - 3 0 0 0 0 0
		--------------------------
		Pass - 1
		UA - 3 2 5 1 6 4 - 2
		SA - 2 3 0 0 0 0
		--------------------------
		Pass - 2
		UA - 3 2 5 1 6 4 - 5
		SA - 2 3 0 0 0 0
		--------------------------
		Pass - 3
		UA - 3 2 5 1 6 4 - 1
		SA - 2 3 5 0 0 0
		--------------------------
		Pass - 4
		UA - 3 2 5 1 6 4 - 6
		SA - 1 2 3 5 6 0
		--------------------------
		Pass - 5
		UA - 3 2 5 1 6 4 - 4
		SA - 1 2 3 4 5 6

		for(int i=2	; i<unsortedArray.length-1;i++){
			swapHappened = false;
			for(int j=unsortedArray.length-1;j>=0;j--){
				if(sortedArray[j]>0){
					if(sortedArray[j]>unsortedArray[i]){
						sortedArray[i] = sortedArray[j];
						sortedArray[j] = unsortedArray[i];
						swaphappaned = true;
					}
				}
			}
			if(!swapHappened){
				sortedArray[i] = unsortedArray[i];
			}
		}*/
		boolean swapHappened = false;
		for(int i=1	; i<unsortedArray.length;i++){
			swapHappened = false;
			for(int j=unsortedArray.length-1;j>=0;j--){
				if(sortedArray[j]>0){
					if(sortedArray[j]>unsortedArray[i]){
						sortedArray[j+1] = sortedArray[j];
						sortedArray[j] = unsortedArray[i];
						swapHappened = true;
					}
				}
			}
			if(!swapHappened){
				sortedArray[i] = unsortedArray[i];
			}
		}

		unsortedArray = Arrays.copyOf(sortedArray, sortedArray.length);

	}

	private void displayArray() {
		CommonUtil.displayArray(unsortedArray);
	}

}
