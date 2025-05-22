package com.backend.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestApplication.class, args);
    System.out.println("ket qua la:" +sumOfTopTwo(new int[]{5, 5, 5, 5}));
    System.out.println("ket qua la:" +sumOfTopTwo(new int[]{-1, -3, -2, -4}));
    System.out.println("ket qua la:" + sumOfTopTwo(new int[]{1, 2, 3, 4, 5}));
  }

  public static int sumOfTopTwo(int[] arr) {
    if (arr == null || arr.length < 2) {
      throw new IllegalArgumentException("Arrays must have least 2 element");
    }
    int max1 = 0;
    int max2 = 0;
    for (int num : arr) {
      if (num > max1) {
        max2 = max1;
        max1 = num;
      } else if (num > max2) {
        max2 = num;
      }
    }
    return max1 + max2;
  }
}
