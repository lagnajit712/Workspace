package com.java.codility;

import java.util.ArrayList;
import java.util.List;

public class pronic {
  public int solution(int A , int B) {
    int sqrt=0;
    int count=0;
    for(int i=A;i<=B;i++){
       sqrt=(int)(Math.sqrt(i));
       if(sqrt*(sqrt+1)==i)
        count++;
      }

    return count;
  }

  public static void main(String[] args) {
    pronic obj = new pronic();
    System.out.println(obj.solution(6,20));

  }
}
