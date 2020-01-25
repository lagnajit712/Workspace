package com.java.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {

  /*
   * Complete the 'gradingStudents' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY grades as parameter.
   */

  public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> newlist;
    if (grades != null && !grades.isEmpty()) {
      newlist = new ArrayList<>();
      for (Integer grade : grades) {
        if (grade >= 38 && ((grade + (5 - (grade % 5)))- grade) < 3) {
          grade = grade + (5 - (grade % 5));
        }
        newlist.add(grade);
      }
    } else {
      return null;
    }
    return newlist;
  }

}

class Solution {
  public static void main(String[] args) throws IOException {
   /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C:\\Workspace\\src\\com\\java\\hackerrank\\input.txt")));

    int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
      try {
        return bufferedReader.readLine().replaceAll("\\s+$", "");
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());
*/
    List<Integer> grades= new ArrayList<>();
    grades.add(73);
    grades.add(67);
    grades.add(38);
    grades.add(33);

    List<Integer> result = GradingStudents.gradingStudents(grades);
    for (Integer i:result) {
      System.out.print(" "+i+" ");

    }

 /*   bufferedWriter.write(
        result.stream()
            .map(Object::toString)
            .collect(joining("\n"))
            + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();*/
  }
}

