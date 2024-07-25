package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class CycledetectionBfs 
{
    static class Pair
    {
        int x;
        int y;
        Pair(int xx,int yy)
        {
            this.x=xx;
            this.y=yy;
        }
    }
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
     int vis[]=new int[v];
     for(int i=0;i<v;i++)
     {
        vis[i]=0;
     }
     for(int i=0;i<v;i++)
     {
        if(vis[i]==0){
        boolean ans=bfs(graph,v,vis,i);
        if(ans==true)
        {
        System.out.println(true);
        return;
     }
    }
 
    }
        System.out.println(false);
}
    static boolean bfs(ArrayList<ArrayList<Edge>> graph1 ,int v,int vis[],int start)
    {
        vis[start]=1;
      Queue<Pair> q=new LinkedList<>();
q.add(new Pair(start,-1));
while(!q.isEmpty())
{
    int aa=q.peek().x;
    int bb=q.peek().y;
     Pair curr=q.remove();
    
        vis[curr.x]=1;
        for(int i=0;i<graph1.get(curr.x).size();i++)
        {
Edge ee= graph1.get(curr.x).get(i);
if(vis[ee.dest]==0)
{
    vis[ee.dest]=1;
    q.add(new Pair(ee.dest,aa));
}
else{
    if(bb!=ee.dest)
    return true;
}


    }
}return false;
    }

}
