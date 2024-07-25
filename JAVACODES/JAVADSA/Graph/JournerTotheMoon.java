package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class JournerTotheMoon
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
int count=0;
int val=v*(v-1)/2;
int vis[]=new int[v];
ArrayList<Integer> g = new ArrayList<>();
for(int i=0;i<v;i++)
{
if(vis[i]==0)
{
count=0;
    dfs(graph,i,vis,count);
    g.add(count);
}
}
for(int i=0;i<g.size();i++)
{
   int ee=g.get(i);
   val=val-((ee*(ee-1))/2);
}
System.out.println(val);




}
static void dfs(ArrayList<ArrayList<Edge>> graph,int cu,int vis[],int count)
{
    vis[cu]=1;
    count++;
    for(int i=0;i<graph.get(cu).size();i++)
    {
        Edge e=graph.get(cu).get(i);
        if(vis[e.dest]==0)
        dfs(graph,e.dest,vis,count);
    }
}
 }
