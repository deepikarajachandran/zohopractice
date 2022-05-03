package com.company;

import java.util.HashMap;

/*Example : [2,1,3,2,2,5,8,9,8]
Output:
2-3
1-1
3-1
5-1
8-2
9-1
 */
public class noofoccurence {
    public static void main(String[] args) {
        int[] a={2,1,3,2,2,5,8,9,8};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int j : a) {
            if (!(hm.containsKey(j))) {
                hm.put(j, 1);
            } else {
                hm.put(j, hm.get(j)+1);
            }

        }
        System.out.println(hm);
    }
}
