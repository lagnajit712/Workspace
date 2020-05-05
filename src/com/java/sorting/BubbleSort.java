package com.java.sorting;

import com.java.codility.pronic;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    BubbleSort bubbleSort= new BubbleSort();
    int[] array={98,45,34,87,23,12,9,10};
    System.out.println("Array elements "+ Arrays.toString(array));
    //int[] sortedarray=doBubbleSort(array);
   // System.out.println("Sorted Array elements "+ Arrays.toString(sortedarray));
    recurBubbleSort(array,array.length);
    System.out.println("Sorted Array recursive elements "+ Arrays.toString(array));
  }
  public static int[] doBubbleSort(int[] arr){
    int temp=0;
    if(Arrays.asList(arr).isEmpty())
      return null;
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    return arr;
  }
  static void recurBubbleSort(int arr[], int n)
  {
    // Base case
    if (n == 1)
      return;

    // One pass of bubble sort. After
    // this pass, the largest element
    // is moved (or bubbled) to end.
    for (int i=0; i<n-1; i++)
      if (arr[i] > arr[i+1])
      {
        // swap arr[i], arr[i+1]
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
      }

    // Largest element is fixed,
    // recur for remaining array
    recurBubbleSort(arr, n-1);
  }
}
