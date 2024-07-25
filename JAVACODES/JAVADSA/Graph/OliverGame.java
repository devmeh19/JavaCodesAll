package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class OliverGame {
   static Scanner sc= new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Enter the number of vertex");
            int v=sc.nextInt();
            ArrayList<ArrayList<Edge>> graph=new ArrayList<>();
            for(int i=0;i<v;i++)
            {
                graph.add(new ArrayList<Edge>());
            }
            System.out.println("Enter the choice ,print 1 to insert and print -1 to exit");
            int cont=sc.nextInt();
            while(cont!=-1){
          System.out.println("Enter the source and the destination you want to add");
            int ss=sc.nextInt();
            int dd=sc.nextInt();
          graph.get(ss).add(new Edge(ss,dd));
          System.out.println("Enter Choice");
          cont=sc.nextInt();
            }
    
    for(int i=0;i<graph.size();i++)
    {
    for(int j=0;j<graph.get(i).size();j++)
    {
        Edge mm=graph.get(i).get(j);
        System.out.println(mm.src+" "+mm.dest);
    }
    }
    System.out.println("Enter the query");
    int q=sc.nextInt();
     int X=sc.nextInt();
      int Y=sc.nextInt();
    int in[]=new int[v];
    int out[]=new int[v];
    boolean vis[]=new boolean[v];
    Dfs(graph,0,vis,in,out);
    boolean ans;
    if(q==1)
ans=subtree(X,Y,in,out);
else
ans=subtree(Y,X,in,out);
System.out.println(ans);
        sc.close();
    } 
    static boolean subtree(int X,int Y,int in[],int out[])
    {
        if(in[X]>in[Y]&&out[X]<out[Y])
        return true;
        return false;
    }
    static int timer=1;
    static void Dfs(ArrayList<ArrayList<Edge>> graph ,int cu,boolean vis[],int in[],int out[])
    {
 vis[cu]=true;
 in[cu]=timer++;
 for(int i=0;i<graph.get(cu).size();i++)
 {
     Edge e=graph.get(cu).get(i);
     if(vis[e.dest]==false)
     Dfs(graph,e.dest,vis,in,out);
 }
 out[cu]=timer++;
    }
}
