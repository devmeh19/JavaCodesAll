package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class DetectCycleDirectedDfs
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

check(graph,v);
       sc.close(); 
    }
   static void check(ArrayList<ArrayList<Edge>> graph,int v)
    {
boolean vis[]=new boolean[v];
boolean rec[]=new boolean[v];
for(int i=0;i<v;i++)
{
    if(vis[i]==false)
    {
boolean ans=Dfs(graph,i,vis,rec);
if(ans==true)
{
System.out.println("True");
return;
}
}
}
System.out.println("False");
    }
   static boolean Dfs(ArrayList<ArrayList<Edge>> graph ,int cu,boolean vis[],boolean rec[])
   {
vis[cu]=true;
rec[cu]=true;
for(int i=0;i<graph.get(cu).size();i++)
{
    Edge e=graph.get(cu).get(i);
    if(vis[e.dest]==false){
    boolean a=Dfs(graph,e.dest,vis,rec);
    if(a==true)
    return true;
}
if(rec[e.dest]==true)
{
    return true;
}

}
rec[cu]=false;
return false;
   }


}
