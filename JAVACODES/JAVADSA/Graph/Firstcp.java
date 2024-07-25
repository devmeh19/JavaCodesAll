package JAVACODES.JAVADSA.Graph;
import java.util.*;
public class Firstcp {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
     {
        int t=sc.nextInt();
        while(t-->=0)
        {
          int n=sc.nextInt(); 
          int a[]=new int[n];
          int x[]=new int[n];
          for(int i=0;i<n;i++)
          {
            a[i]=sc.nextInt();
            x[i]=sc.nextInt();
          } 
          int max=Integer.MIN_VALUE;
          for(int i=0;i<n;i++)
          {
            if(a[i]==1)
            {
                if(x[i]>=max)
                {
                    max=x[i];
                }
            }
          }
          int min=Integer.MAX_VALUE;
           for(int i=0;i<n;i++)
          {
            if(a[i]==2)
            {
                if(x[i]<=min)
                {
                    min=x[i];
                }
            }
          }
          int count=0;
          for(int i=0;i<n;i++)
          {
          if(a[i]==3&&x[i]>=max&&x[i]<=min)
          {
     count++;
          }
          }
         int m=min-max+1;
         int mm=m-count;
         if(max<=min)
System.out.println(mm);
else
System.out.println(0);
System.out.println();
        }
    }    
}
