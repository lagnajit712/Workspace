package com.java.techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Beyblade {

    public static void main(String args[]) throws Exception {
      //System.out.println("Enter Number of Test Cases ");
      Scanner in = new Scanner(System.in);
      int numberOfTestCase = in.nextInt();
      int teamSize;
      int i=0;
      int j=0;

      //System.out.println("You entered numberOfTestCase " + numberOfTestCase);
      while (numberOfTestCase > 0) {
        teamSize = in.nextInt();
        //System.out.println("You entered teamSize " + teamSize);
        int[] g_revolution_team= new int[teamSize];
        int[] opponent_revolution_team= new int[teamSize];
        //3 6 7 5 3 5 6 2 9 1
        for(i=0;i<teamSize;i++){
          g_revolution_team[i] = in.nextInt();
        }
        //System.out.println("You entered g_revolution_team  " + Arrays.toString( g_revolution_team));
        //2 7 0 9 3 6 0 6 2 6
        for(j=0;j<teamSize;j++){
          opponent_revolution_team[j] = in.nextInt();
        }
        Arrays.sort(g_revolution_team);
        Arrays.sort(opponent_revolution_team);
        //System.out.println("You entered string2  " + Arrays.toString(opponent_revolution_team));
        //System.out.println("Max fight won by team G_Revolution " + getMaxWinForGRevolution(g_revolution_team,opponent_revolution_team,teamSize));
        System.out.println(getMaxWinForGRevolution(g_revolution_team,opponent_revolution_team,teamSize));
        List<Integer> grevlist=IntStream.of(g_revolution_team)
            .boxed()
            .collect(Collectors.toList());
        List<Integer> oppntlist=IntStream.of(opponent_revolution_team)
            .boxed()
            .collect(Collectors.toList());
        numberOfTestCase--;
      }
    }

    private static int getMaxWinForGRevolution(int[] grev, int[] oppnt, int teamSize) {

      Arrays.sort(grev);
      Arrays.sort(oppnt);
      int maxWin=0;
      int i=0,j=0;
      while(i<teamSize) {
        if (grev[i] > oppnt[j]) {
          maxWin++;
          i++;
          j++;
        } else {
          i++;
        }
      }
      return maxWin;
    }

  }

