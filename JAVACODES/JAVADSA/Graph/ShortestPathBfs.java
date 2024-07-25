package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class ShortestPathBfs {
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
           System.out.println("Enter thenodes whose shortest path you want to find");
        int s=sc.nextInt();
        int t=sc.nextInt();
        for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edge mm=graph.get(i).get(j);
    System.out.println(mm.src+" "+mm.dest);
}
}
Queue<Integer>  q= new LinkedList<>();
boolean vis[]=new boolean[v];
int p[]=new int[v];
q.add(0);
vis[0]=true;
p[0]=-1;
while(!q.isEmpty())
{
     int curr=q.remove();

        for(int i=0;i<graph.get(curr).size();i++)
        {
Edge ee= graph.get(curr).get(i);
if(vis[ee.dest]==false)
{
vis[ee.dest]=true;
p[ee.dest]=curr;
q.add(ee.dest);
}

 }
        }
     
        int a=t;
        System.out.println(a);
     while(a!=s)
     {
        a=p[a];
        System.out.println(a);
     }
       sc.close(); 
}
}
