package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class WiredConnections 
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
        int pp=0;
        for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edge mm=graph.get(i).get(j);
pp++;
    System.out.println(mm.src+" "+mm.dest);
}
}
pp=pp/2;
int c=0;
boolean vis[]=new boolean[v];
for(int i=0;i<v;i++)
{
    if(vis[i]==false)
    {
        c++;
Dfs(graph,i,vis);
    }
}
if(pp<v-1){
System.out.println(-1);
}
else{
    System.out.println(c-1);
}
       sc.close(); 
    }
   static void Dfs(ArrayList<ArrayList<Edge>> graph ,int cu,boolean vis[])
   {
System.out.println(cu);
vis[cu]=true;
for(int i=0;i<graph.get(cu).size();i++)
{
    Edge e=graph.get(cu).get(i);
    if(vis[e.dest]==false)
    Dfs(graph,e.dest,vis);
}
   }


}
