package com.java.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MissingWords {

  public static List missingWords(String s, String t) {
    // Write your code here
    String[] parts = s.split(" ");
    String[] otherparts = t.split(" ");

    List missing = new ArrayList<>();
    for (int i = 0, j = 0; i < parts.length; i++)
    {
      if (j < otherparts.length && parts[i].equals(otherparts[j]))
      {
        j++;
      }
      else
      {
        missing.add(parts[i]);
      }
    }

    return missing;
  }
}
class Program {
  public static void main(String[] args) {
    String s = "I am using hackerrank to improve programming";
    String t = "am hackerrank to improve";
    List<String> result=MissingWords.missingWords(s,t);
    result.forEach(word -> System.out.println(word));
  }
}
