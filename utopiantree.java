package com.company;
/*
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height.
Each summer, its height increases by 1 meter.
A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring.
How tall will the tree be after  growth cycles?
For example, if the number of growth cycles is , the calculations are as follows:
Period  Height
0          1
1          2
2          3
3          6
4          7
5          14
 */
public class utopiantree {
    public static void main(String[] args) {

        int height=1;
        for(int i=0;i<6;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" "+height);
            }
            else
            {
                height=height*2;
                System.out.println(i+" "+height);
                height++;
            }
        }

    }
}
