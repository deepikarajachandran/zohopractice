package com.company;

public class diamondpattern {
    public static void main(String[] args) {
        int k=1,q=2;
        for(int i=0;i<4;i++)
        {
            int p=k;
            for(int j=0;j<4;j++)
            {

                if((i+j)>2)
                {
                    System.out.print("  ");
                    System.out.print(p+" ");
                    p--;

                }
                else
                {
                    System.out.print("  ");
                }
            }
            k=k+q;
            q++;
            System.out.println();
        }
        k=k-q+1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i<j || i==j )
                {
                    System.out.print("  ");
                    System.out.print(k+" ");
                    k--;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
