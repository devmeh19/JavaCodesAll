package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class BellManFord 
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
        for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edgew mm=graph.get(i).get(j);
    System.out.println(mm.src+" "+mm.dest);
}
}
for(int i=0;i<v;i++)
{
    if(bellman(i,v,graph)==1)
    {
      System.out.println("Negative Cycle");
      return;
    }
}
System.out.println("No");
sc.close();
    }

   public static int bellman(int s,int v,ArrayList<ArrayList<Edgew>> graph)
   {
       int  dist[]=new int[v];
for(int i=0;i<v;i++)
{
   dist[i]=Integer.MAX_VALUE;
}
dist[s]=0;

for(int i=0;i<v-1;i++)
{
for(int j=0;j<v;j++)
{
for(int k=0;k<graph.get(j).size();k++)
{
   Edgew ee=graph.get(j).get(k);
   int u=ee.src;
   int vv=ee.dest;
   int www=ee.w;
   if(dist[u]!=Integer.MAX_VALUE && dist[u]+www<dist[vv])
   {
       dist[vv]=dist[u]+www;
   }

}
}
}
       for(int j=0;j<v;j++)
{
for(int k=0;k<graph.get(j).size();k++)
{
   Edgew ee=graph.get(j).get(k);
   int u=ee.src;
   int vv=ee.dest;
   int www=ee.w;
   if(dist[u]!=Integer.MAX_VALUE && dist[u]+www<dist[vv])
   {
    return 1;
   
   }

}
}

       return 0;
       
       
   }
}
