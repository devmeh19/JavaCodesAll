package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class Bridge
 {
    static Scanner sc=new Scanner(System.in);
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
int t[]=new int[v];
int lt[]=new int[v];
boolean vis[]=new boolean[v];
ArrayList<Edge> gg=new ArrayList<>();
int timer=1;
for(int i=0;i<v;i++)
{
    if(vis[i]==false)
dfs(0,-1,t,lt,vis,graph,gg,timer);
}
for(int i=0;i<gg.size();i++)
{
    System.out.println(gg.get(i).src+" "+gg.get(i).dest);
}



sc.close();
}
static void dfs(int start,int parent,int t[],int lt[],boolean vis[],ArrayList<ArrayList<Edge>> graph,ArrayList<Edge> gg,int timer )
{
   vis[start]=true;
   t[start]=timer;
   lt[start]=timer;
   timer++;
   for(int i=0;i<graph.get(start).size();i++)

   {
    Edge e=graph.get(start).get(i);
    if(e.dest==parent)
    continue;
    if(vis[e.dest]==false)
    {
       dfs(e.dest,start,t,lt,vis,graph,gg,timer);
        lt[start]=Math.min(lt[start],lt[e.dest]);
        if(lt[e.dest]>t[start])
        {
        gg.add(new Edge(start,e.dest));
        }
    }
    else{
        lt[start]=Math.min(lt[start],t[e.dest]);
    }
   }
}

 }
