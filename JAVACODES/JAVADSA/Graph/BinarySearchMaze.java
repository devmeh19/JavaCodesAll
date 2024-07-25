package JAVACODES.JAVADSA.Graph;
import java.util.*;

  class Pair
    {
        int o;
        int oo;
        int ooo;
        Pair(int a,int b,int c)
        {
            this.o=a;
            this.oo=b;
            this.ooo=c;
        }
    }

public class BinarySearchMaze 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
         //Pair ob=new Pair(0,0,0);
System.out.println("Enter no. of rows , no.of columns, elements");
int r=sc.nextInt();
int c1=sc.nextInt();
int  grid[][]=new int[r][c1];
for(int i=0;i<r;i++)
{
    for(int j=0;j<c1;j++)
    {
grid[i][j]=sc.nextInt();
    }
}
System.out.println("Enter source and destination");
int s[]=new int[2];
int d[]=new int[2];
for(int i=0;i<2;i++)
{
    s[i]=sc.nextInt();
}
for(int i=0;i<2;i++)
{
    d[i]=sc.nextInt();
}
  if(s[0]==d[0]&s[1]==d[1])

  {
    System.out.println(0);
    return ;
  }
        int nn=grid.length;
        int mm=grid[0].length;
        int dist[][]=new int[nn][mm];
        for(int i=0;i<nn;i++)
        {
            for(int j=0;j<mm;j++)
            {
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[s[0]][s[1]]=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,s[0],s[1]));
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            Pair curr=q.remove();
            int a=curr.o;
            int b=curr.oo;
            int c=curr.ooo;
            for(int i=0;i<4;i++)
            {
                int nrow=b+dr[i];
                int ncolumn=c+dc[i];
                if(nrow>=0&&nrow<nn&&ncolumn>=0&&ncolumn<mm&&grid[nrow][ncolumn]==1&& (a+1<dist[nrow][ncolumn]))
                {
                   dist[nrow][ncolumn]=a+1;
                   if(d[0]==nrow&&d[1]==ncolumn){
                System.out.println(dist[nrow][ncolumn]);
                return ;
                   }
                   q.add(new Pair(1+a,nrow,ncolumn));
                }
              
            }
        }
        
        
        sc.close();
    }
}
