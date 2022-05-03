package com.company;
/*
Given a 9×9 sudoku we have to evaluate it for its correctness.
We have to check both the sub matrix correctness and the whole sudoku correctness.
Input:
board[][] = {{7, 9, 2, 1, 5, 4, 3, 8, 6},
             {6, 4, 3, 8, 2, 7, 1, 5, 9},
             {8, 5, 1, 3, 9, 6, 7, 2, 4},
             {2, 6, 5, 9, 7, 3, 8, 4, 1},
             {4, 8, 9, 5, 6, 1, 2, 7, 3},
             {3, 1, 7, 4, 8, 2, 9, 6, 5},
             {1, 3, 6, 7, 4, 8, 5, 9, 2},
             {9, 7, 4, 2, 1, 5, 6, 3, 8},
             {5, 2, 8, 6, 3, 9, 4, 1, 7}}
Output: Valid
 */
import java.util.HashSet;

public class validsudoku {
    public static boolean checksudoku(int[][] board)
    {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                //if(board[i][j]!='.'){}        // for check the question..where numbers are not placed
                if(board[i][j]==0)
                {
                    return false;
                }
                String row=board[i][j]+"in row"+i;
                String column=board[i][j]+"in col"+j;
                String mat=board[i][j]+"in sqr"+i/3+" "+j/3;

                if(hs.contains(row)||hs.contains(column)||hs.contains(mat))
                {
                    return false;
                }
                hs.add(row);
                hs.add(column);
                hs.add(mat);

            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] board =
              { { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
                { 6, 4, 3, 8, 2, 7, 1, 5, 9 },
                { 8, 5, 1, 3, 9, 6, 7, 2, 4 },
                { 2, 6, 5, 9, 7, 3, 8, 4, 1 },
                { 4, 8, 9, 5, 6, 1, 2, 7, 3 },
                { 3, 1, 7, 4, 8, 2, 9, 6, 5 },
                { 1, 3, 6, 7, 4, 8, 5, 9, 2 },
                { 9, 7, 4, 2, 1, 5, 6, 3, 8 },
                { 5, 2, 8, 6, 3, 9, 4, 1, 7 } };

        if(checksudoku(board))
        {
            System.out.println("valid sudoku");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
