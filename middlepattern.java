package com.company;
/*
            G 
          G R 
        G R A 
      G R A M 
    G R A M P 
  G R A M P R 
G R A M P R O 

Process finished with exit code 0

*/
public class middlepattern {
    public static void main(String[] args) {
        String s="PROGRAM";
        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            int start=0;
            int mid=ch.length/2;
            for(int j=0;j<ch.length;j++)
            {
                if((i+j) >5 && (i+j) <10)
                {
                    System.out.print(ch[mid]+" ");
                    mid++;
                }
                else if((i+j )>=10)
                {
                    System.out.print(ch[start]+" ");
                    start++;
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
