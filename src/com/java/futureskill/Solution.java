package com.java.futureskill;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args){
        int[] array1={10,12,3,17,8,19};
        int[] array2={10,12,3,17,8,19,1,13,21};
        Solution solution= new Solution();
        solution.getMaxProfitDays(array2);
    }

    public void getMaxProfitDays(int[] array){
        int buyDate=0;
        int sellDate=0;
        int maxgain=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i] && (array[j]-array[i])>maxgain){
                    maxgain=array[j]-array[i];
                    sellDate=j;
                    buyDate=i;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("\nMax gain is "+ maxgain+"\n with Buy Date on "+buyDate+"\n Sell date on "+sellDate );
    }
}
