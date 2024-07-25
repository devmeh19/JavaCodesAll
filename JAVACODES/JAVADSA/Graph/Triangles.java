package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class Triangles
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
       System.out.println("Enter no.of vertex");
       int v=sc.nextInt();
       System.out.println("Enter rows and columns");
       int n=sc.nextInt();
       int m=sc.nextInt();
      int graph[][]=new int[n][m];
       System.out.println("Enter Elements");
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               graph[i][j]=sc.nextInt();
           }
       }
       int aux2[][] = new int[v][v];
 

       int  aux3[][] = new int[v][v];
   
   
   
       multiply(graph, graph, aux2,v);
   
       multiply(graph, aux2, aux3,v);
   
    
    int trace = getTrace(aux3,v);
      int mm= (trace / 6);
      System.out.println(mm);
       sc.close();
}
static void multiply(int A[][], int B[][], int C[][],int V)
{
    for(int i = 0; i < V; i++)
    {
        for(int j = 0; j < V; j++)
        {
            C[i][j] = 0;
            for(int k = 0; k < V; k++)
                C[i][j] += A[i][k] * B[k][j];
        }
    }
}
 static int  getTrace(int graph1[][],int V)
{
   int trace = 0;
    for(int i = 0; i < V; i++)
        trace += graph1[i][i];
         
    return trace;
}
 }
