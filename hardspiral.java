package com.company;

/*print the given matrix in spiral way
* ip  {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12}

  op 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
      */

public class hardspiral {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                       {13,14,15,16}};
        int rows = arr.length;
        int cols = arr[0].length;
        // Defining the boundaries of the matrix.
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        // Defining the direction in which the array is to be traversed.
        int dir = 1;

        while (top <= bottom && left <= right) {

            if (dir == 1) {    // moving left->right
                for (int i = left; i <= right; ++i) {
                    System.out.print(arr[top][i] + " ");
                }
                ++top;
                dir = 2;
            }
            else if (dir == 2) {     // moving top->bottom
                for (int i = top; i <= bottom; ++i) {
                    System.out.print(arr[i][right]+ " ");
                }
                --right;
                dir = 3;
            }
            else if (dir == 3) {     // moving right->left
                for (int i = right; i >= left; --i) {
                    System.out.print(arr[bottom][i]+ " ");
                }
                --bottom;
                dir = 4;
            }
            else if (dir == 4) {     // moving bottom->up
                for (int i = bottom; i >= top; --i) {
                    System.out.print(arr[i][left]+ " ");
                }
                ++left;
                dir = 1;
            }
        }


    }
}
