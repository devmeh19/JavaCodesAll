package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class StronglyConnected 
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
Stack<Integer> s=new Stack<>();
boolean vis[]=new boolean[v];
for(int i=0;i<v;i++)
{
    if(vis[i]==false)
Dfs(graph,i,vis,s);
}
ArrayList<ArrayList<Edge>> ll=new ArrayList<>();
for(int i=0;i<v;i++)
        {
            ll.add(new ArrayList<>());
        }
for(int i=0;i<v;i++)
{
    for(int j=0;j<graph.get(i).size();j++)

    {
        Edge e=graph.get(i).get(j);
        ll.get(e.dest).add(new Edge(e.dest,e.src));
    }
}
for(int i=0;i<v;i++)
        {
           vis[i]=false;
        }
int count=0;
while(!s.isEmpty())
{
    int curr=s.pop();
    if(vis[curr]==false)
{
    dfs(ll,curr,vis);
    count++;
}

}
System.out.println(count);



       sc.close(); 
    }
    static void dfs(ArrayList<ArrayList<Edge>> graph ,int cu,boolean vis[])
    {
 vis[cu]=true;
 for(int i=0;i<graph.get(cu).size();i++)
 {
     Edge e=graph.get(cu).get(i);
     if(vis[e.dest]==false)
     dfs(graph,e.dest,vis);
 }
    }
    static void Dfs(ArrayList<ArrayList<Edge>> graph ,int cu,boolean vis[],Stack<Integer> s)
    {
 vis[cu]=true;
 for(int i=0;i<graph.get(cu).size();i++)
 {
     Edge e=graph.get(cu).get(i);
     if(vis[e.dest]==false)
     Dfs(graph,e.dest,vis,s);
 }
 s.push(cu);
    }
 

}
