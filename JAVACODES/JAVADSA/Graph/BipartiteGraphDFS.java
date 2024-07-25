package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class BipartiteGraphDFS 
{
    
   static Scanner sc=new Scanner (System.in) ;
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

int colour[]=new int[v];
for(int i=0;i<v;i++)
{
    colour[i]=-1;
}
boolean ans=false;
for(int i=0;i<v;i++)
{
    if(colour[i]==-1)
{
ans=dfs(graph,colour,i,0);
    if(ans==false)
    {
    System.out.println("False");
    return ;
}
}
}
System.out.println("True");
sc.close();
   }
   static boolean dfs(ArrayList<ArrayList<Edge>> graph,int colour[],int start,int co)
   {
    colour[start]=co;
for(int i=0;i<graph.get(start).size();i++)
{
    Edge e=graph.get(start).get(i);
    if(colour[e.dest]==-1)
    {
       boolean ans= dfs(graph,colour,e.dest,1-co);
       if(ans==false)
       return false;
    }
    else if(colour[e.dest]==colour[start])
    return false;
}
    return true;
   }
}
