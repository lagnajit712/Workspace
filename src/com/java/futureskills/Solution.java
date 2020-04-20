package com.java.futureskills;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

 public void getMaxProfit(int[] arr){
   int[] storeGains= new int[arr.length*2];
   String position="";
   int key=0;
   HashMap<Integer,String> storePositionforGain= new HashMap<>();
   int c=0;
   for(int i=0;i<arr.length;i++){
     for(int j=i+1;j<arr.length;j++){
       if(arr[j]>arr[i]){
          key=arr[j]-arr[i];
          storeGains[c]=key;
          position=i+","+j;
          c++;
         storePositionforGain.put(key,position);
       }
     }
   }
   System.out.print("Gain array is "+storeGains);
   Arrays.sort(storeGains);
   System.out.println("Max gain is"+ storeGains[0]);
   String gainPosition=storePositionforGain.get(storeGains[0]);
   String[] pos=gainPosition.split(",");
   System.out.println("Buy date is "+pos[0]+" Sell Date is "+pos[2]);
 }
public int getBuyDay(){
  return -2;
}
public int getSellDay() {
  return -2;
}

public static void main(String[] args) {
   int[] array= {40,67,23,56,90,65,32};
   Solution sol = new Solution();
   sol.getMaxProfit(array);
}
}
