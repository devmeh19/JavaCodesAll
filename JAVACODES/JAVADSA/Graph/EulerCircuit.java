package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class EulerCircuit
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
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
if(!isconnected(graph,v))
{
    System.out.println("No");
    return ;
}
int odd=0;
for(int i=0;i<v;i++)
{
if(graph.get(i).size()%2!=0)
odd++;
}
if(odd>2)
{
System.out.println("No");
return ;
}
if(odd==2)
System.out.println("Semi");
else
System.out.println("yes");



        sc.close();
    }
    static boolean isconnected(ArrayList<ArrayList<Edge>> graph,int v)
    {
        int node=-1;
  for(int i=0;i<graph.size();i++)
{
  if(graph.get(i).size()>0)
  {
    node=i;
    break;
  }

}
if(node==-1)
return true;
boolean vis[]=new boolean[v];
Dfs(graph,node,vis);
for(int i=0;i<v;i++)
{
    if(vis[i]==false&&graph.get(i).size()>0)
    return false;
}
return true;
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
