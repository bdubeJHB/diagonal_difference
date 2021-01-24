package com.runaddictmusic.difference;

import java.util.List;
import java.util.ArrayList;


/**
 * Diagonal difference challenge from Hackerrank
 * <p>
 * The goal is to get the difference between the sum of numbers in crossing
 * diagonal lines within a square 2d array (left-to-right and right-to-left diagonal)
 * <p>
 * Example: for the following 2D array,
 *      [[a, b, c],
 *       [d, e, f],
 *       [g, h, i]]
 * The result will be the absolute value from this calculation: (a + e + h) - (c + e + g).
 *
 * @author      Benedict Dube
 * @version     1.0 24 Jan 2021
 */
public class Diagonal {
        static boolean checkIfListIsSquare(List<List<Integer>> listOfLists) {
                int     expectedSize = 0;

                if(listOfLists.get(0).isEmpty()) return false;

                expectedSize = listOfLists.get(0).size();

                for(List<Integer> list : listOfLists) {
                        if(list.isEmpty() || list.size() != expectedSize) {
                                return false;
                        }
                }

                return true;
        }

        static boolean checkIfListIsSquare(int arrayOfArrays[][]) {
                int     expectedSize = 0;

                if(arrayOfArrays[0] == null) return false;

                expectedSize = arrayOfArrays[0].length;

                for(int arr[] : arrayOfArrays) {
                        if(arr == null || arr.length != expectedSize) return false;
                }

                return true;
        }

        public static int calculate(List<List<Integer>> listOfLists) {
                int sum = 0;
                int left_diag = 0;
                int right_diag = 0;

                if(listOfLists.isEmpty() || !checkIfListIsSquare(listOfLists))
                        return -1;

                for(int j = listOfLists.size() - 1, i = 0;
                                i < listOfLists.size(); i++, j--) {
                        left_diag = left_diag + listOfLists.get(i).get(i);
                        right_diag = right_diag + listOfLists.get(i).get(j);
                }

                sum = left_diag - right_diag;

                return (sum > 0 ? sum : sum * -1);
        }

        public static int calculate(int[][] array_numbers) {
                return 0;
        }

        /* --- Originally, I wanted to redirect list inputs to the array input method, but not anymore ---
        public static int calculate(List<List<Integer>> listOfLists) {
                int     arrayOfArrays[][] = new int[listOfLists.size()][listOfLists.get(0).size()];

                for(int i = 0; i < listOfLists.size(); i++) {
                        for(int j = 0; j < listOfLists.get(0).size(); j++) {
                                arrayOfArrays[i][j] = listOfLists.get(i).get(j);
                        }
                }

                return calculate(arrayOfArrays);
        }
        --- */
}
