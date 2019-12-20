package com.java.codility;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

  public int solution(int N) {
    String byteArray = Integer.toBinaryString(N);
    int maxBinaryGap = 0;
    List<Integer> positionArray = new ArrayList();

    for (int i = 0; i < byteArray.length(); i++) {
      if (byteArray.charAt(i) == '0')
        continue;
      positionArray.add(i);
    }

    for (int i = 0; i < positionArray.size() - 1; i++) {
      //subtract 1 so that don't count 1's next to each other as having any gap
      int indicesDiff = (positionArray.get(i + 1)) - (positionArray.get(i)) - 1;

      maxBinaryGap = Math.max(maxBinaryGap, indicesDiff);
    }
    return maxBinaryGap;
  }

  public static void main(String[] args) {
    Solution1 solution1 = new Solution1();
    System.out.println(solution1.solution(1041));

  }
}
