
package com.company;
import java.lang.Math;

/*O/P
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/
public class spiralpattern {
    public static void main(String[] args) {
        int i,j,n=2;
        int m=2*n-1;
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=m;j++)
            {
            int p=Math.max(Math.abs(i-n),Math.abs(j-n))  +1;
                System.out.print(p+ " ");
            }
            System.out.println();
        }

    }
}
