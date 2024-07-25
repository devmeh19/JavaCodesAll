package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
 class Pair1
    {
        int ro;
        int co;
        int st;
        Pair1(int roww,int columnn,int stepp)
        
        {
            this.ro=roww;
            this.co=columnn;
            this.st=stepp;
        }
    }
public class DistanceNearest1 
{
    
    static Scanner sc=new Scanner(System.in);
    public static int[][] nearest(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair1> q=new LinkedList<>();
      int vis[][]=new int[n][m];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              if(grid[i][j]==1)
              {
                  q.add( new Pair1(i,j,0));
                  vis[i][j]=1;
              }
              else
              vis[i][j]=0;
          }
      }
      int rr[]={-1,0,1,0};
      int cc[]={0,1,0,-1};
int dist[][]=new int[n][m];
        while(!q.isEmpty())
        {
            int row=q.peek().ro;
            int column=q.peek().co;
            int step=q.peek().st;
          dist[row][column]=step;
            q.remove();
            for(int i=0;i<4;i++)
            {
            int nrow=row+rr[i];
            int ncolumn=column+cc[i];
            if(nrow>=0&&nrow<n&&ncolumn>=0&&ncolumn<m&&vis[nrow][ncolumn]==0)
            {
                
                q.add(new Pair1(nrow,ncolumn,step+1));
                vis[nrow][ncolumn]=1;
            }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        //Pair ob=new Pair(0,0,0);
    System.out.println("Enter no. of rows , no.of columns, elements");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int  a[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
    a[i][j]=sc.nextInt();
        }
    }
    int b[][]=new int[r][c];
    b=nearest(a);
        for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            System.out.println(b[i][j]);
        }
    }
            sc.close();
        }
    
}
