package com.runaddictmusic.difference;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


public class TestDiagonal {
        @Test
        public void testCalculateGetsCorrectResultWhenPassed2dArray() {
                int arrayOfArrays[][] = new int[][] {
                                                new int[] {4, 7},
                                                new int[] {1, 2}};

                assertEquals(2, Diagonal.calculate(arrayOfArrays));
        }

        @Test
        public void testCalculateWorksOnNegativeNumberArrays() {
                int arrayOfArrays[][] = new int[][] {
                                                new int[] {-3, -4},
                                                new int[] {-2, -1}};

                assertEquals(1, Diagonal.calculate(arrayOfArrays));
        }

        @Test
        public void testCalculateGetsCorrectResult() {
                List<List<Integer>> listOfLists = new ArrayList<>();
                List<Integer> row1 = new ArrayList<Integer>();
                List<Integer> row2 = new ArrayList<Integer>();

                row1.add(3);
                row1.add(9);
                row2.add(2);
                row2.add(4);
                listOfLists.add(row1);
                listOfLists.add(row2);

                assertEquals(4, Diagonal.calculate(listOfLists));
        }

        @Test
        public void testCalculateRejectsNonSquareLists() {
                List<List<Integer>> listOfLists = new ArrayList<>();
                List<Integer> row1 = new ArrayList<Integer>();
                List<Integer> row2 = new ArrayList<Integer>();
                List<Integer> row3 = new ArrayList<Integer>();

                row1.add(1);
                row1.add(2);
                row1.add(3);
                listOfLists.add(row1);

                row2.add(4);
                row2.add(6);
                listOfLists.add(row2);

                row3.add(7);
                row3.add(8);
                row3.add(9);
                listOfLists.add(row3);

                assertEquals(-1, Diagonal.calculate(listOfLists));
        }

        @Test
        public void testCalculateRejectsNonSquareArrays() {
                int arrayOfArrays[][] = new int[][] {
                                                new int[] {1, 2, 3},
                                                new int[] {4, 6},
                                                new int[] {7, 8, 9}};

                assertEquals(-1, Diagonal.calculate(arrayOfArrays));
        }

        @Test
        public void testCalculateWorksOnListsWithDifferentlySignedIntegers() {
                List<List<Integer>> listOfLists = new ArrayList<>();
                int arrayOfArrays[][] = new int[][] {
                                                new int[] {-4, 0, 4, 8},
                                                new int[] {3, -1, -5, -9},
                                                new int[] {-2, 2, 6, 10},
                                                new int[] {1, -3, -7, -11}};

                for(int i = 0; i < arrayOfArrays.length; i++) {
                        List<Integer> row = new ArrayList<Integer>();

                        for(int j = 0; j < arrayOfArrays[0].length; j++) {
                                row.add(j);
                        }

                        listOfLists.add(row);
                }

                assertEquals(4, Diagonal.calculate(listOfLists));
        }

        @Test
        public void testCalculateReturnsZeroForEmptyArrayOrList() {
                List<List<Integer>> listOfLists = new ArrayList<>();
                int arrayOfArrays[][] = new int[][] {new int[] {}};

                List<Integer> emptyList = new ArrayList<Integer>();
                listOfLists.add(emptyList);

                assertEquals(0, Diagonal.calculate(listOfLists));
                assertEquals(0, Diagonal.calculate(arrayOfArrays));
        }
}

