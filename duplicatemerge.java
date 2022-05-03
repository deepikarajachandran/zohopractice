package com.company;

import java.util.Arrays;
import java.util.HashSet;

/*Given two sorted arrays output a merged array without duplicates.
Array1: [1, 2, 3, 6, 9]
Array2: [2, 4, 5, 10]
Merged Array: [1, 2, 3, 4, 5, 6, 9, 10]
*/
public class duplicatemerge {
    /*
    public static void main(String[] args) {
        int[] arr1={1,3,6,9};
        int[] arr2={2,4,4,10};
        int m=arr1.length;
        int n= arr2.length;
        int[] arr3=new int[m+n];
        int k=0;
        for (int value : arr1) {
            arr3[k++] = value;
        }

        for (int j : arr2) {
            arr3[k++] = j;
        }
        Arrays.sort(arr3);

        for(int j=0;j<k;j++)
        {
            if(arr3[j]==arr3[j+1])
            {

                for(int p=j+1;p<k-1;p++)
                {
                    arr3[p]=arr3[p+1];
                }
                break;
            }
        }
        k=k-1;
        for(int l=0;l<k;l++)
            System.out.print(arr3[l] + " ");
       //System.out.println(Arrays.toString(arr3));
    }
}*/

//code for 2 num duplicates
public static void main(String[] args) {
    int[] arr1={1,2,3,6,9};
    int[] arr2={2,4,4,10};
    int m=arr1.length;
    int n= arr2.length;
    int[] arr3=new int[m+n];
    int k=0;
    for (int value : arr1) {
        arr3[k++] = value;
    }
    for (int j : arr2) {
        arr3[k++] = j;
    }
    Arrays.sort(arr3);
    HashSet<Integer> hs=new HashSet<>();
    for (int j : arr3) {
        hs.add(j);
    }
    System.out.println(hs);
}

}


