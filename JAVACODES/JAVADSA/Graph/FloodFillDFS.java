package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class FloodFillDFS 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
     {
        System.out.println("Enter Rows and Columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int image[][]=new int[r][c];
        System.out.println("Enter Elements");
        for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
        {
image[i][j]=sc.nextInt();
        }
     }
     System.out.println("Enter row and column of source and new colour");
     int sr=sc.nextInt();
     int sc1=sc.nextInt();
     int newcolour=sc.nextInt();
        int new1= image[sr][sc1];
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        dfs(sr,sc1,image,new1,dr,dc,newcolour);
           for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
        {
          System.out.println( image[i][j]);
        }
     }
    }
    static void dfs(int row,int col,int image[][],int new1,int dr[],int dc[],int newcolour)
    {
        image[row][col]=newcolour;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++)
        {
          int nrow=row+dr[i];
          int ncol=col+dc[i];
          if(nrow>=0&&ncol>=0&&nrow<n&&ncol<m&&image[nrow][ncol]==new1&&image[nrow][ncol]!=newcolour)
          dfs(nrow,ncol,image,new1,dr,dc,newcolour);
        }
    
    }
}
