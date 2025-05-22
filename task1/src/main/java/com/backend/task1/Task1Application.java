package com.backend.task1;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task1Application {

  public static void main(String[] args) {
    SpringApplication.run(Task1Application.class, args);
    String[] input = {"a", "ab", "abc", "cd", "def", "gh"};
    findMostFrequentLengthStrings(input);
  }

  public static void findMostFrequentLengthStrings(String[] arr) {
    int[] arr1 = new int[100];
    int[] arr2 = new int[arr.length];

    int count;
    for (int i = 0; i < arr.length; i++) {
      count = arr[i].length();
      arr2[i] = count;
      arr1[count]++;
    }
    System.out.println("Độ dài từng chuỗi:  :" + Arrays.toString(arr2));

    int maxFreq = 0;
    int maxLen = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr1[i] > maxFreq) {
        maxFreq = arr1[i];
        maxLen = i;
      }
    }
    System.out.println("Chuỗi có độ dài xuất hiện nhiều nhất (" + maxLen + "):");
    for (int i = 0; i < arr.length; i++) {
      if (arr2[i] == maxLen) {
        System.out.println(arr[i]);
      }
    }
  }

}
