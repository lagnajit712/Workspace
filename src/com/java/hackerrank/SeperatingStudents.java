package com.java.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeperatingStudents {

  public static int maxMoves(List<Integer> avg) {
    int maxMoves = 0;
    if (avg != null && avg.size() == 0) {
      return 0;
    }
    int totalLength = avg.size();
    int countOnes = 0;
    int countZeros = 0;
    int i = 0;
    int[] swappedarray ;
    boolean istrue=true;
    int countOnesIndexes=0;
    swappedarray = avg.stream().mapToInt(Integer::intValue).toArray();
    System.out.println("Input Array");
    for(i = 0; i < totalLength; i++) {
      System.out.print(" "+swappedarray[i]+" ");
    }
    for (i = 0; i < totalLength; i++) {
      if (avg.get(i) == 1)
        countOnes++;
      else
        countZeros++;
    }
    System.out.println("\n"+"Ones Count " + countOnes+" and Zeros Count " + countZeros);
    System.out.println("\n");
    while(countOnesIndexes!=countOnes) {
      countOnesIndexes=0;
      for (i = 0; i < totalLength-1; i++) {
        if (swappedarray[i] == 0 && swappedarray[i + 1] == 1) {
          swappedarray[i] = 1;
          swappedarray[i + 1] = 0;
        }
      }
      maxMoves++;
      for(i = 0; i < totalLength; i++) {
        System.out.print(" "+swappedarray[i]+" ");
      }
      System.out.println("\n" +"Max Moves now " + maxMoves);
      for(i = 0; i < countOnes; i++) {
        if(swappedarray[i]==1)
        countOnesIndexes++;
      }
     // System.out.println("Count Ones Index " + countOnesIndexes);

    }
    return maxMoves;
  }
}

class Program2 {
  public static void main(String[] args) {
    int[] arr0 = {1, 1, 1, 1, 0, 0, 0, 0};
    int[] arr1 = {0, 1, 0, 1, 0, 0, 0, 1};//{1, 0, 1, 0, 0, 0, 1, 0}-->{1, 1, 0, 0, 0, 1, 0, 0}-->{1, 1, 0, 0, 1, 0, 0, 0}-->{1, 1, 0, 1, 0, 0, 0, 0}-->{1, 1, 1, 0, 0, 0, 0, 0}
    int[] arr2 = {0, 0, 0, 0, 1, 1, 1, 1};
    int[] arr3 = {1, 1, 0, 1, 0, 1, 0, 1};
    List<Integer> students =  Arrays.stream(arr3).boxed().collect(Collectors.toList());
    System.out.println("\n" +"Max Moves required " + SeperatingStudents.maxMoves(students));
  }
}
