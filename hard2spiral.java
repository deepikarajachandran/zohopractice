package com.company;

import java.util.Arrays;

/*Enter The Value For N :
5

1       2       3      4       5
16      17      18     19      6
15      24      25     20      7
14      23      22     21      8
13      12      11     10      9     */

public class hard2spiral {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        int rows = arr.length;
        int cols = arr[0].length;
        // Defining the boundaries of the matrix.
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        // Defining the direction in which the array is to be traversed.
        int dir = 1;
        int value=1;
        while (top <= bottom && left <= right) {

            if (dir == 1) {    // moving left->right
                for (int i = left; i <= right; ++i) {
                    arr[top][i] =value;
                    value++;
                }
                ++top;
                dir = 2;
            }
            else if (dir == 2) {     // moving top->bottom
                for (int i = top; i <= bottom; ++i) {
                    arr[i][right]=value;
                    value++;
                }
                  --right;
                dir = 3;
            }
            else if (dir == 3) {     // moving right->left
                for (int i = right; i >= left; --i) {
                    arr[bottom][i]=value;
                    value++;
                }
                --bottom;
                dir = 4;
            }
            else if (dir == 4) {     // moving bottom->up
                for (int i = bottom; i >= top; --i) {
                    arr[i][left]=value;
                    value++;
                }
                ++left;
                dir = 1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
