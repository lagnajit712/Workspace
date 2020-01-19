package com.java.codility;

import java.util.ArrayList;

public class NonRepetativeWord {
      public String[] solution(int N, int K) {
      if (N == 0) {
        return new String[] {""};
      }
      ArrayList<String> result = new ArrayList<String>();
      for (String p : solution(N - 1, K - 1)) {
        for (char l : new char[] {'a', 'b', 'c'}) {
          int pLen = p.length();
          if (pLen == 0 || p.charAt(pLen - 1) != l) {
            result.add(p + l);
          }
        }
      }
      int prefSize = Math.min(result.size(), K);
      return result.subList(0, prefSize).toArray(new String[prefSize]);
    }
  public static void main(String[] args) {
    NonRepetativeWord obj = new NonRepetativeWord();
    String[] result =obj.solution(5,6);
    if(result!=null){
      for(String s:result)
        System.out.println(s + " ,");
    }
  }
}
