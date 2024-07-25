package JAVACODES.JAVADSA.Graph;
import java.util.*;
 class Edge{
    int src;
    int dest;
    Edge(int ss,int dd)

    {
        this.src=ss;
        this.dest=dd;
}
}
public class Creationgraph2
 {
  
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of vertex");
        int v=sc.nextInt();
       // System.out.println("Enter the number of edges");
       // int e =sc.nextInt();
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
        System.out.println("Enter the node whose vertex you want to find");
        int neig=sc.nextInt();
        for(int i=0;i<graph.get(neig).size();i++)
{
     Edge edg=graph.get(neig).get(i);
     System.out.println(edg.dest);
}
for(int i=0;i<graph.size();i++)
{
for(int j=0;j<graph.get(i).size();j++)
{
    Edge mm=graph.get(i).get(j);
    System.out.println(mm.src+" "+mm.dest);
}
}

       sc.close(); 
    }

}
