package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        int pokes = (size - 1) / 2;
        for (int r = 0; r < size; r++) {
          for (int c = 0; c < size; c++) {
            if (r < pokes || r > pokes) {
              int spacesBtwn = pokes - r;
              int spacesBefore = r;
              if (r > pokes) {
                spacesBtwn = r - pokes;
                spacesBefore = size - r - 1;
              }
              boolean inBounds = c - spacesBefore >= 0 && c < size - spacesBefore;
              if ((c - spacesBefore) % spacesBtwn == 0 && inBounds) {
                grid[r][c] = "*";
              } else {
                grid[r][c] = " ";
              }
              continue;
            } 
            grid[r][c] = "*";
          }
        }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      int size = snowflake.length;
      for (int r = 0; r < size; r++) {
        for (int c = 0; c < size; c++) {
          System.out.print(snowflake[r][c]);
        }
        System.out.println();
      }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      printSnowflake(generateSnowflake(41));
    }
}
