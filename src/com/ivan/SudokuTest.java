package com.ivan;

import static org.junit.Assert.*;
import org.junit.Test;


public class SudokuTest {

    @Test
    public void myTest1() {
        int[][] grid =
                {{0,0,0,0,0,0,2,0,0},
                {0,8,0,0,0,7,0,9,0},
                {6,0,2,0,0,0,5,0,0},
                {0,7,0,0,6,0,0,0,0},
                {0,0,0,9,0,1,0,0,0},
                {0,0,0,0,2,0,0,4,0},
                {0,0,5,0,0,0,6,0,3},
                {0,9,0,4,0,0,0,7,0},
                {0,0,6,0,0,0,0,0,0}};

        int[][] expectedGrid =
                {{9,5,7,6,1,3,2,8,4},
                {4,8,3,2,5,7,1,9,6},
                {6,1,2,8,4,9,5,3,7},
                {1,7,8,3,6,4,9,5,2},
                {5,2,4,9,7,1,3,6,8},
                {3,6,9,5,2,8,7,4,1},
                {8,4,5,7,9,2,6,1,3},
                {2,9,1,4,3,6,8,7,5},
                {7,3,6,1,8,5,4,2,9}};

        SudokuSolver.solveSudoku(grid);
        assertArrayEquals(expectedGrid, grid);
    }

    @Test
    public void myTest2() {
        int[][] grid = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        int[][] expectedGrid = {
            {5,3,4,6,7,8,9,1,2},
            {6,7,2,1,9,5,3,4,8},
            {1,9,8,3,4,2,5,6,7},
            {8,5,9,7,6,1,4,2,3},
            {4,2,6,8,5,3,7,9,1},
            {7,1,3,9,2,4,8,5,6},
            {9,6,1,5,3,7,2,8,4},
            {2,8,7,4,1,9,6,3,5},
            {3,4,5,2,8,6,1,7,9}
        };

        SudokuSolver.solveSudoku(grid);
        assertArrayEquals(expectedGrid, grid);
    }

    @Test
    public void myTest3() { // "World's Hardest Sudoku"!!
        int[][] grid = {
            {8,0,0,0,0,0,0,0,0},
            {0,0,3,6,0,0,0,0,0},
            {0,7,0,0,9,0,2,0,0},
            {0,5,0,0,0,7,0,0,0},
            {0,0,0,0,4,5,7,0,0},
            {0,0,0,1,0,0,0,3,0},
            {0,0,1,0,0,0,0,6,8},
            {0,0,8,5,0,0,0,1,0},
            {0,9,0,0,0,0,4,0,0}
        };

        int[][] expectedGrid = {
            {8,1,2,7,5,3,6,4,9},
            {9,4,3,6,8,2,1,7,5},
            {6,7,5,4,9,1,2,8,3},
            {1,5,4,2,3,7,8,9,6},
            {3,6,9,8,4,5,7,2,1},
            {2,8,7,1,6,9,5,3,4},
            {5,2,1,9,7,4,3,6,8},
            {4,3,8,5,2,6,9,1,7},
            {7,9,6,3,1,8,4,5,2}
        };

        SudokuSolver.solveSudoku(grid);
        assertArrayEquals(expectedGrid, grid);
    }
}