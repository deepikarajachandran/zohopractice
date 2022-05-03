package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class nextgreater {
    public static void main(String[] args) {
        int[] a = {6, 3, 9, 8, 10, 2, 1, 15, 7, 10};
        int n = 10;
        System.out.println(Arrays.toString(a));
        HashSet<Integer> hs = new HashSet<>();
        for (int j : a) {
            hs.add(j);
        }
        for (int p : a) {
            int flag = 0;
            for (int k = 1; k < n; k++) {
                if (hs.contains(p + k)) {
                    int v = p + k;
                    System.out.print(v);
                    flag++;
                    break;
                }
            }
            if (flag > 0) {
                System.out.print("  ");
            } else {
                System.out.print("_  ");
            }
        }

    }
}
 /*
import java.util.Arrays;

public class nextgreater {
    public static void main(String[] args) {
        int[] a={6, 3, 9, 8, 10, 2, 1, 15, 7};
        int[] b=new int[a.length];
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]==a[a.length-1]) {
                    b[i]=0;
                }
                if(a[i]<a[j])
                {
                    b[i]=a[j];
                    break;
                }
             }
        }

        System.out.println(Arrays.toString(b));
    }

}
*/
