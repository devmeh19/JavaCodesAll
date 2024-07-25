package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
class Pair
    {
        int ro;
        int co;
        int tm;
        Pair(int roww,int columnn,int timee)
        
        {
            this.ro=roww;
            this.co=columnn;
            this.tm=timee;
        }
    }
public class RotAllOranges {
    static Scanner sc=new Scanner(System.in);
    
        
    public static int orangesRotting(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
      int vis[][]=new int[n][m];
      int fresh=0;
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              if(grid[i][j]==2)
              {
                  q.add( new Pair(i,j,0));
                  vis[i][j]=2;
              }
              else
              vis[i][j]=0;
              if(grid[i][j]==1)
              fresh++;
          }
      }
      int rr[]={-1,0,1,0};
      int cc[]={0,1,0,-1};
        int t=0;
        int cnt=0;
        while(!q.isEmpty())
        {
            int row=q.peek().ro;
            int column=q.peek().co;
            int time=q.peek().tm;
            t=Math.max(t,time);
            q.remove();
            for(int i=0;i<4;i++)
            {
                
            int nrow=row+rr[i];
            int ncolumn=column+cc[i];
            if(nrow>=0&&nrow<n&&ncolumn>=0&&ncolumn<m&&vis[nrow][ncolumn]==0&&grid[nrow][ncolumn]==1)
            {
                
                q.add(new Pair(nrow,ncolumn,t+1));
                cnt++;
                vis[nrow][ncolumn]=2;
            }
            }
        }
        if(cnt!=fresh)
        return -1;
        else
        return t;
        
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
System.out.println(orangesRotting(a));
        sc.close();
    }

}