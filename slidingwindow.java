package com.company;
/*Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
Output: 3 3 4 5 5 5 6
Explanation:
Maximum of 1, 2, 3 is 3
Maximum of 2, 3, 1 is 3
Maximum of 3, 1, 4 is 4
Maximum of 1, 4, 5 is 5
Maximum of 4, 5, 2 is 5
Maximum of 5, 2, 3 is 5
Maximum of 2, 3, 6 is 6
*/
public class slidingwindow {
    public static void main(String[] args) {
        int[] a={3,2,7,6,5,1,2,3,2,4,5,6};
        int n=a.length,k=3;
        for(int i=0;i<n-2;i++)
        {
            int max=a[i];
            for(int j=i+1;j<k;j++)
            {
                if(max<a[j])
                {
                    max=a[j];
                }
            }
            k=k+1;
            System.out.println("max for "+i+" set is "+ max);
        }
    }
}
