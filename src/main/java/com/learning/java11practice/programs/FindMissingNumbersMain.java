package com.learning.java11practice.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumbersMain {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] intArr = {1, 2, 3, 4, 5, 6, 7,9};
    int len = intArr.length+1;

    int sumOfNNums = Arrays.stream(intArr).sum();

    int sumOfTotal = (len * (len + 1)) / 2;

    int remNum = sumOfTotal - sumOfNNums;
    System.out.println("Missing Amnt" + remNum);
  }
}
