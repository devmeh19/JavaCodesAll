package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class CircularTour {
 static Scanner sc=new Scanner(System.in);
 static int tour(int petrol[], int distance[])
 {
	
 int start=0;
 int deficit=0;
 int balance=0;
 for(int i=0;i<petrol.length;i++)
 {
     balance+=petrol[i]-distance[i];
     if(balance<0)
     {
         deficit+=balance;
         start=i+1;
         balance=0;
     }
 }
 if(balance+deficit>=0)
 return start;
 else
 return -1;
}
 public static void main(String[] args) {
    System.out.println("Enter total petrol pumps , petrol, distance");
    int n=sc.nextInt();
    int p[]=new int[n];
    int d[]=new int[n];
    for(int i=0;i<n;i++)
    {
        p[i]=sc.nextInt();
    }
       for(int i=0;i<n;i++)
    {
        d[i]=sc.nextInt();
    }
System.out.println(tour(p,d));

    sc.close();
 }   
}
