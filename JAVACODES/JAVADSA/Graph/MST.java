package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class MST
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
           for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edgew mm=graph.get(i).get(j);
    System.out.println(mm.src+" "+mm.dest+" " +mm.w);
}
}
int key[]=new int[v];
boolean mst[]=new boolean[v];
int p[]=new int[v];
for(int i=0;i<v;i++)
{
    key[i]=Integer.MAX_VALUE;
    mst[i]=false;
    p[i]=-1;
}
key[0]=0;

for(int i=0;i<v-1;i++)
{
    int u=0;
int mini=Integer.MAX_VALUE;
    for(int j=0;j<v;j++)
    {
    if(mst[j]==false&&key[j]<mini)
    {
        mini=key[i];
        u=j;
    }
    }
mst[u]=true;
for(int k=0;k<graph.get(u).size();k++)
{
Edgew e=graph.get(u).get(k);
if(mst[e.dest]==false&&e.w<key[e.dest])
{
p[e.dest]=u;
key[e.dest]=e.w;
}


}





}
for(int i=0;i<v;i++)
{
    System.out.println(key[i]);
}
for(int i=0;i<v;i++)
{
    System.out.println(p[i]);
}





       sc.close(); 
    }
}
