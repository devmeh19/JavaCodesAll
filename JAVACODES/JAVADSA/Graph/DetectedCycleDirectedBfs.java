package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class DetectedCycleDirectedBfs {
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

int in[]=new int[v];
 for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edge mm=graph.get(i).get(j); 
      in[mm.dest]++;
}
}
Queue<Integer> q= new LinkedList<>();
for(int i=0;i<v;i++)
{
    if(in[i]==0)
    q.add(i);
}
int count=0;
while(!q.isEmpty())
{
     int curr=q.remove();
count++;
        for(int i=0;i<graph.get(curr).size();i++)
        {
Edge ee= graph.get(curr).get(i);
in[ee.dest]--;
if(in[ee.dest]==0)
q.add(ee.dest);

 }
        }
        if(count==v)
        System.out.println("False");
        else
        System.out.println("True");
    


       sc.close(); 
}
}
