package JAVACODES.JAVADSA.Array;
import java.util.*;
public class kthelement 
{
     
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("Enter Elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            matrix[i][j]=sc.nextInt();
        }
      System.out.println("Enter k");
      int k=sc.nextInt();
          int start=matrix[0][0];
        int end=matrix[r-1][c-1];
        int mediani=k-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int le=lelements(matrix,mid);
            if(le<=mediani)
            {
            start=mid+1;
            }
            if(le>mediani)
            {
                end=mid-1;
            }
            
        }
        System.out.println(start);
}

public static int lelements(int matrix[][],int aa)
{
    int ns=0;
    for(int i=0;i<matrix.length;i++)
    {
        
    int start=0;
    int end=matrix[i].length-1;
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        if(matrix[i][mid]<=aa)
        {
        start=mid+1;
        }
        else
        {
            end=mid-1;
        }
        
    }
    ns=ns+start;
    }
   return ns;
}
}
