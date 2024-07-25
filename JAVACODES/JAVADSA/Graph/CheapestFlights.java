package JAVACODES.JAVADSA.Graph;
import java.util.*;
class Pai{
int one;
int sec;
Pai(int o,int s)
{
    this.one=o;
    this.sec=s;
}
}
public class CheapestFlights
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of vertex");
        int v=sc.nextInt();
        ArrayList<ArrayList<Edgew>> graph=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            graph.add(new ArrayList<Edgew>());
        }
        System.out.println("Enter the choice ,print 1 to insert and print -1 to exit");
        int cont=sc.nextInt();
        while(cont!=-1){
      System.out.println("Enter the source,the destination and the weight you want to add");
        int ss=sc.nextInt();
        int dd=sc.nextInt();
        int ww=sc.nextInt();
      graph.get(ss).add(new Edgew(ss,dd,ww));
      System.out.println("Enter Choice");
      cont=sc.nextInt();
        }
           System.out.println("Enter the nodes  and stops whose shortest path you want to find");
        int s=sc.nextInt();
        int t=sc.nextInt();
        int ss=sc.nextInt();
        for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edgew mm=graph.get(i).get(j);
    System.out.println(mm.src+" "+mm.dest);
}
}
Queue<Pai>  q= new LinkedList<>();
// boolean vis[]=new boolean[v];
int  dist[]=new int[v];
for(int i=0;i<v;i++)
{
    dist[i]=Integer.MAX_VALUE;
}
dist[s]=0;
q.add(new Pai(s,0));
while(!q.isEmpty())
{
   Pai curr=q.remove();
   int oo=curr.one;
   int ooo=curr.sec;
if(oo>ss)
continue;
        for(int i=0;i<graph.get(ooo).size();i++)
        {
Edgew ee= graph.get(ooo).get(i);
if(dist[ooo]+ee.w<dist[ee.dest])
{
    dist[ee.dest]=dist[ooo]+ee.w;
    q.add(new Pai(oo+1,ee.dest));
}

 }
        }
     
    System.out.println(dist[t]);
       sc.close(); 
}
}
