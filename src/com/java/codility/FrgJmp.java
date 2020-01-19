package com.java.codility;

public class FrgJmp {
  public int solution(int X, int Y, int D) {
    // write your code in Java SE 8
    int mod=(Y-X) % D;
    int nofJmp= 0;
    if(mod>0)
      nofJmp=((Y-X) / D)+1;
    else
      nofJmp=((Y-X) / D);
    return nofJmp;
  }
  public static void main(String[] args) {
    FrgJmp obj = new FrgJmp();
    System.out.println(obj.solution(10,85,30));

  }
}
