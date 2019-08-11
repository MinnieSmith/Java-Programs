package com.minniesmith;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        setUpGoal();

    }


    private static void setUpGoal() {
        int size = 4;
        int[][] goal = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                goal[i][j] = i + j * size + 1;
        goal[size-1][size-1] = 0;
        System.out.println(Arrays.deepToString(goal));
    }
}
