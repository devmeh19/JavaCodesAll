package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class ShortestPathUndirected 
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
           System.out.println("Enter the nodes whose shortest path you want to find");
        int s=sc.nextInt();
        for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edge mm=graph.get(i).get(j);
    System.out.println(mm.src+" "+mm.dest);
}
}
Queue<Integer>  q= new LinkedList<>();

int dist[]=new int[v];
for(int i=0;i<v;i++)
{
    dist[i]=Integer.MAX_VALUE;
}
dist[s]=0;
q.add(s);

while(!q.isEmpty())
{
     int curr=q.remove();

        for(int i=0;i<graph.get(curr).size();i++)
        {
Edge ee= graph.get(curr).get(i);
if(dist[curr]+1<dist[ee.dest]){
dist[ee.dest]=dist[curr]+1;
q.add(ee.dest);
}

 }
        }
   for(int i=0;i<v;i++)
   {
    if(dist[i]!=Integer.MAX_VALUE)
    {
        System.out.println(dist[i]);
    }
    else{
        dist[i]=-1;
    System.out.println(dist[i]);
    }
   }  
       
       sc.close(); 
}
}

