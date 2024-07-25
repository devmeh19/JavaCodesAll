package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class ReplaceOwithX
 {
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args)
    {
        System.out.println("Enter rows and columns");
        int n=sc.nextInt();
        int m=sc.nextInt();
        char a[][]=new char[n][m];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.next().charAt(0);
            }
        }
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
    int vis[][]=new int[n][m];
    for(int j=0;j<m;j++){
        if(a[0][j]=='O'&& vis[0][j]==0)
        {
            dfs(0,j,vis,dr,dc,a);
        }
        if(a[n-1][j]=='O'&&vis[n-1][j]==0)
        {
         dfs(n-1,j,vis,dr,dc,a);   
        }
        
        
        
    }
      for(int j=0;j<n;j++){
        if(a[j][0]=='O'&& vis[j][0]==0)
        {
            dfs(j,0,vis,dr,dc,a);
        }
        if(a[j][m-1]=='O'&&vis[j][m-1]==0)
        {
            dfs(j,m-1,vis,dr,dc,a);
        }
        
        
        
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        
    {
        if(vis[i][j]==0&&a[i][j]=='O')
        a[i][j]='X';
    }
    }
        
    for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            System.out.println(a[i][j]);
            }
        }

sc.close();
   } 
   static void dfs(int row,int col,int vis[][],int dr[],int dc[],char a[][])
   {
       vis[row][col]=1;
       int nn=a.length;
       int mm=a[0].length;
       for(int i=0;i<4;i++)
       {
           int nr=row+dr[i];
           int nc=col+dc[i];
           if(nr>=0&&nc>=0&& nr<nn && nc<mm&&vis[nr][nc]==0&&a[nr][nc]=='O')
           dfs(nr,nc,vis,dr,dc,a);
       }
   }
}
