package com.runaddictmusic.difference;

import java.util.List;
import java.util.ArrayList;


/**
 * Diagonal difference challenge
 *
 * @author      Benedict Dube
 * @version     1.0 24 Jan 2021
 */
public class Diagonal {
        public static int calculate(int[][] array_numbers) {
                return 0;
        }

        public static int calculate(List<List<Integer>> listOfLists) {
                int     arrayOfArrays[][] = new int[listOfLists.size()][listOfLists.get(0).size()];

                for(int i = 0; i < listOfLists.size(); i++) {
                        for(int j = 0; j < listOfLists.get(0).size(); j++) {
                                arrayOfArrays[i][j] = listOfLists.get(i).get(j);
                        }
                }

                return calculate(arrayOfArrays);
        }
}
