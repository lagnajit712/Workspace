package com.java.sorting;

import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    BubbleSort bubbleSort= new BubbleSort();
    int[] array={98,45,34,87,23,12,9,10};
    System.out.println("Array elements "+ Arrays.toString(array));
    int[] sortedarray=BubbleSort.doBubbleSort(array);
    // System.out.println("Sorted Array elements "+ Arrays.toString(sortedarray));
    int element=34;
    System.out.println("Element in  "+ binarySearchRecursive(sortedarray,0,array.length-1,element));
  }

  private static int binarySearchRecursive(int[] arr, int l, int r, int element) {
    if (r >= l) {
      int mid = l + (r - l) / 2;

      // If the element is present at the
      // middle itself
      if (arr[mid] == element)
        return mid;

      // If element is smaller than mid, then
      // it can only be present in left subarray
      if (arr[mid] > element)
        return binarySearchRecursive(arr, l, mid - 1, element);

      // Else the element can only be present
      // in right subarray
      return binarySearchRecursive(arr, mid + 1, r, element);
    }

    // We reach here when element is not present
    // in array
    return -1;
  }
}
