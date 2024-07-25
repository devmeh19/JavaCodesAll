package JAVACODES.JAVADSA.Graph;
import java.util.*;
 
class Bfs {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of vertex");
        int v=sc.nextInt();
        ArrayList<ArrayList<Edge>> graph=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            graph.add(new ArrayList<>());
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

int vis[]=new int[v];
for(int i=0;i<v;i++)
{
    if(vis[i]==0)
bfs(graph,v,vis,i);
}
       sc.close(); 
    }
    static void bfs(ArrayList<ArrayList<Edge>> graph1 ,int v,int vis[],int start)
    {
      Queue<Integer> q=new LinkedList<>();
q.add(start);
vis[start]=1;
while(!q.isEmpty())
{
    int curr=q.remove();
        System.out.print(curr+" ");
        for(int i=0;i<graph1.get(curr).size();i++)
        {
Edge ee= graph1.get(curr).get(i);
 if(vis[ee.dest]==0)
 {
    vis[ee.dest]=1;
q.add(ee.dest);
 }
        }
    
}
    }


}

