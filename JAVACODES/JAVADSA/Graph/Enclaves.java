package JAVACODES.JAVADSA.Graph;
import java.util.*;


public class Enclaves 
{
       static class Pair
    {
        int a;
        int b;
        Pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    
    static Scanner sc=new Scanner(System.in);
 public static void main(String[] args) 
 {
    
    System.out.println("Enter rows and columns");
    int n=sc.nextInt();
    int m=sc.nextInt();
   int grid[][]=new int[n][m];
    System.out.println("Enter Elements");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            grid[i][j]=sc.nextInt();
        }
    }
      
    Queue<Pair> q=new LinkedList<>();
    int nn=grid.length;
    int mm=grid[0].length;
    int g[][]=new int[nn][mm];
    for(int i=0;i<nn;i++){
        for(int j=0;j<mm;j++)
        {
            if(i==0||i==nn-1|| j==0||j==mm-1)
            {
                if(grid[i][j]==1){
                q.add(new Pair(i,j));
                g[i][j]=1;
                }
            }
        }
    }
    int dr[]={-1,0,1,0};
    int dc[]={0,1,0,-1};
    while(!q.isEmpty())
    {
        Pair curr=q.remove();
        int row=curr.a;
        int col=curr.b;
         for(int i=0;i<4;i++)
        {
            int nrow=row+dr[i];
            int ncolumn=col+dc[i];
            if(nrow>=0&&nrow<nn&&ncolumn>=0&&ncolumn<mm&&grid[nrow][ncolumn]==1&&g[nrow][ncolumn]==0 )
            {
          g[nrow][ncolumn]=1;
               q.add(new Pair(nrow,ncolumn));
            }
          
        }
    }
    int count=0;
    for(int i=0;i<nn;i++)
    {
        for(int j=0;j<mm;j++)
        {
            if(g[i][j]==0&&grid[i][j]==1)
            count++;
        }
    }
    
System.out.println(count);


    sc.close();
 }
}
