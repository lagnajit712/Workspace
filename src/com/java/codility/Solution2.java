package com.java.codility;

public class Solution2 {

    public int[] solution(int[] A, int K) {
      int [] rotatedA = new int[A.length];

      for(int i=0; i<A.length; i++) {
        //rotated index needs to "wrap" around end of array
        int rotatedIndex = (i + K) % A.length;

        rotatedA[rotatedIndex] = A[i];
      }
      return rotatedA;
    }
  public static void main(String[] args) {
    Solution2 solution2 = new Solution2();
    int[] A=new int[]{3, 8, 9, 7, 6};
    System.out.println(solution2.solution(A,3));

  }
}
