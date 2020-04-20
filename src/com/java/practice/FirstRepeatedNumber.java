package com.java.practice;

import java.util.*;
import java.util.stream.Collectors;

public class FirstRepeatedNumber {
  public static void main(String[] args) {
    ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

    System.out.println(numbersList);
    int minIndex = 0;
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < numbersList.size(); i++) {
      if (!set.add(numbersList.get(i))) {
        minIndex = i;
        break;
      }
    }
    System.out.println(" First Duplicate is "+numbersList.get(minIndex));
  }
}
