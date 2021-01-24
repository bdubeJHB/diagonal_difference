package com.runaddictmusic.difference;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


public class TestDiagonal {
        @Test
        public void testDiagonalWorksOn2dLists() {
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
}

