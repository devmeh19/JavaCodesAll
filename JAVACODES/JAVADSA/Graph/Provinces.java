package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class Provinces 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of vertex");
        int v=sc.nextInt();
       // System.out.println("Enter the number of edges");
       // int e =sc.nextInt();
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
boolean vis[]=new boolean[v];
for(int i=0;i<v;i++)
{
    if(vis[i]==false)
    count++;
Dfs(graph,i,vis);
}
System.out.println(count);
       sc.close(); 
    }
   static void Dfs(ArrayList<ArrayList<Edge>> graph ,int cu,boolean vis[])
   {
vis[cu]=true;
for(int i=0;i<graph.get(cu).size();i++)
{
    Edge e=graph.get(cu).get(i);
    if(vis[e.dest]==false)
    Dfs(graph,e.dest,vis);
}
   }


}
