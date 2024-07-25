package JAVACODES.JAVADSA.Array;

import java.util.*;
public class SortedMatrixTwoD
 {
     static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int Mat[][]=new int[r][c];
        System.out.println("Enter Elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            Mat[i][j]=sc.nextInt();
        }
       
     
          int p=0;
        int a[]=new int[r*c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[p]=Mat[i][j];
                p++;
            }
        }
        Arrays.sort(a);
         p=0;
            for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               Mat[i][j]= a[p];
                p++;
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            System.out.println(Mat[i][j]);
        }
       
}
 }
