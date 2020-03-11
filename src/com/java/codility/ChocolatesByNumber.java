package com.java.codility;


import java.util.Arrays;

public class ChocolatesByNumber {

    public static void main(String[] args){
        ChocolatesByNumber chocolatesByNumber= new ChocolatesByNumber();
        System.out.println(chocolatesByNumber.solution(2,1));

    }

    public int solution(int N, int M) {
        // write your code in Java SE 8
        //int lcm = N * M / gcd(N, M);
        //return lcm / M;
        int lcm = N / gcd(N, M);
        return lcm;
    }

    public int gcd(int a, int b) {
        if(a % b == 0) return b;
        return gcd(b,a%b);
    }
}
