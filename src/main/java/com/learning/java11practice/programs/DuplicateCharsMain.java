package com.learning.java11practice.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharsMain {

  public static void main(String[] args) throws IOException {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter String");
    String str = bf.readLine();

    List<Character> listOfChars =
        str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
    System.out.println("List of Characters are : " + listOfChars);

    System.out.println(listOfChars.stream().distinct().count());

    System.out.println(
        "Count of all the duplicate characters: "
            + listOfChars.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() > 1)
                .collect(Collectors.toList()));

    System.out.println(
        "Max Value in the List is : "
            + listOfChars.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get());
  }
}
