package com.company;
/*Write a program to print the below pattern
for n = 6
	1	7	12	16	19	21
	2	8	13	17	20
	3	9	14	18
	4	10	15
	5	11
	6
*/
public class pattern {
    public static void main(String[] args) {
        int n=6,row=n;
        for(int i=1;i<=n;i++)
        {
            int sum=i,num=n;
            for(int j=1;j<=row;j++)
            {
                System.out.print(sum+"  ");
                sum=sum+num;
                num--;
            }
            row--;
            System.out.println();
        }

    }
}
