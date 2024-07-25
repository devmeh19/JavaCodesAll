package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class PathGreaterThanK 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of vertex");
        int v=sc.nextInt();
       // System.out.println("Enter the number of edges");
       // int e =sc.nextInt();
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
        System.out.println("Enter the vertex whose shortest distance you want to find and distance");
        int source=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edgew mm=graph.get(i).get(j);
    System.out.println(mm.src+" "+mm.dest+" " +mm.w);
}
}

boolean vis[]=new boolean[v];
boolean ans=Ddfs(graph,source,vis,k);
if(ans==true)
{
System.out.println("True");
   }

System.out.println("False");
sc.close();
}

static boolean Ddfs(ArrayList<ArrayList<Edgew>> graph ,int cu,boolean vis[],int k)
{
vis[cu]=true;
if(k<=0)
return true;
for(int i=0;i<graph.get(cu).size();i++)
{
 Edgew e=graph.get(cu).get(i);
  if(vis[e.dest]==true)
 continue;
 if(e.w>=k)
 return true;
 boolean ans=Ddfs(graph,e.dest,vis,k-e.w);
if(ans==true)
return true;
}
vis[cu]=false;
return false;
}
}