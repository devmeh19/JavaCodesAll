package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class EventualTopological
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
ArrayList<ArrayList<Edge>> graph1=new ArrayList<>();
for(int i=0;i<v;i++)
{
graph1.add(new ArrayList<>());
}
 for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
   Edge mm=graph.get(i).get(j); 
      graph1.get(mm.dest).add(new Edge(mm.dest,mm.src));
}
}
int in[]=new int[v];
 for(int i=0;i<graph1.size();i++)
{
for(int j=0;j<graph1.get(i).size();j++)
{
    Edge mm=graph1.get(i).get(j); 
      in[mm.dest]++;
}
}


Queue<Integer> q= new LinkedList<>();
for(int i=0;i<v;i++)
{
    if(in[i]==0)
    q.add(i);
}

while(!q.isEmpty())
{
     int curr=q.remove();
        System.out.print(curr+" ");
        for(int i=0;i<graph1.get(curr).size();i++)
        {
Edge ee= graph1.get(curr).get(i);
in[ee.dest]--;
if(in[ee.dest]==0)
q.add(ee.dest);

 }
        }
    


       sc.close(); 
}
}
