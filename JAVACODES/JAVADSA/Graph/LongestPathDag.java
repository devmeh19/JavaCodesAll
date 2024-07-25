package JAVACODES.JAVADSA.Graph;
import java.util.*;

public class LongestPathDag 
{
    static class Edgew
{
    int src;
    int dest;
    int w;
    Edgew(int ss,int dd,int ww)
    {
    this.src=ss;
    this.dest=dd;
    this.w=ww;
    }
}
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of vertex");
        int v=sc.nextInt();
        ArrayList<ArrayList<Edgew>> graph=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            graph.add(new ArrayList<Edgew>());
        }
        System.out.println("Enter the choice ,print 1 to insert and print -1 to exit");
        int cont=sc.nextInt();
        while(cont!=-1){
      System.out.println("Enter the source,the destination and the weight you want to add");
        int ss=sc.nextInt();
        int dd=sc.nextInt();
        int ww=sc.nextInt();
      graph.get(ss).add(new Edgew(ss,dd,ww));
      System.out.println("Enter Choice");
      cont=sc.nextInt();
        }
        System.out.println("Enter the vertex whose shortest distance you want to find");
        int source=sc.nextInt();
        for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edgew mm=graph.get(i).get(j);
    System.out.println(mm.src+" "+mm.dest+" " +mm.w);
}
}
Stack<Integer> s=new Stack<>();
boolean vis[]=new boolean[v];
for(int i=0;i<v;i++)
{
    if(vis[i]==false)
Dfs(graph,i,vis,s);
}
int dist[]=new int[v];
for(int i=0;i<v;i++)
{
    dist[i]=Integer.MIN_VALUE;
}
dist[source]=0;
while(!s.isEmpty())
{
    int cur=s.pop();
    if(dist[cur]!=Integer.MIN_VALUE)
    {
     for(int i=0;i<graph.get(cur).size();i++)
     {
        Edgew ee= graph.get(cur).get(i);
      if(dist[cur]+ee.w>dist[ee.dest])
      {
        dist[ee.dest]=dist[cur]+ee.w;
      }


     }
    }
}
for(int i=0;i<v;i++)
{
    System.out.println(dist[i]);
}

       sc.close(); 
    }
   static void Dfs(ArrayList<ArrayList<Edgew>> graph ,int cu,boolean vis[],Stack<Integer> s)
   {
vis[cu]=true;
for(int i=0;i<graph.get(cu).size();i++)
{
    Edgew e=graph.get(cu).get(i);
    if(vis[e.dest]==false)
    Dfs(graph,e.dest,vis,s);
}
s.push(cu);
   }


}
