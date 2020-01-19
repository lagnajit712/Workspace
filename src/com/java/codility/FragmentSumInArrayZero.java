package com.java.codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FragmentSumInArrayZero {
  public int solution(int [] A) {
    int count = 0;
    int[] sum = new int[A.length + 1];
    sum[0] = 0;
    for (int i = 1; i <= A.length; i++)
      sum[i] = sum[i - 1] + A[i - 1];
    for (int start = 0; start < A.length; start++) {
      for (int end = start + 1; end <= A.length; end++) {
        if (sum[end] - sum[start] == 0)
          count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    pronic obj = new pronic();
    System.out.println(obj.solution(6,20));

  }

}
