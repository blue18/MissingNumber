// How do you find the missing number in a given integer array of 1 to 100? (solution)

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MissingNumber {
  public static void main(String[] args) {

    int list[] = {1, 2, 3, 4, 5, 6, 8};

    // Get first int in the list
    int firstNumber = list[0];

    // Get last int in the list
    int lastNumber = list[list.length - 1];

    // Will traverse the list
    int itr = 0;

    // Fill the array with data
    for (int i = firstNumber; i <= list.length + 1; i++) {

      // if sequential number is not in the list, then display the missing number
      if(i != list[itr]) {
        System.out.println("This value is missing: " + i);

        // Stay with the current number in order for the sequential i to catch up
        itr--;
      }

      // Go to the next element in the list
      itr++;
    }
  }
}
