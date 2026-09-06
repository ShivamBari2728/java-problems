// 200. Number of Islands
// Medium
// Topics
// premium lock icon
// Companies
// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3

import java.util.ArrayList;

public class numberOfIsland {

    public static void traveseallsides(char[][] grid, int i, int j) {

        //outside the grid
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }

        // If  water or already visited or just water....stop
        if (grid[i][j] == '0') {
            return;
        }

        System.out.println("added index " + i + j);
        grid[i][j] = '0';

        // Go up
        traveseallsides(grid, i - 1, j, visited);

        // Go down
        traveseallsides(grid, i + 1, j, visited);

        // Go left
        traveseallsides(grid, i, j - 1, visited);

        // Go right
        traveseallsides(grid, i, j + 1, visited);
    }

    public static void main(String[] args) {

        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '1', '0' },
                { '0', '1', '0', '1', '1' },
                { '0', '0', '0', '0', '0' },
                { '1', '0', '1', '1', '1' }
        };

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {

                    count++;
                    traveseallsides(grid, i, j, visited);
                }
            }
        }
        System.out.println("Number of islands: " + count);
    }
}