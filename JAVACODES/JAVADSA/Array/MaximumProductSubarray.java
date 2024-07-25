package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MaximumProductSubarray
 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         // code here
         long max=a[0];
         long min=a[0];
         long res=a[0];
         for(int i=1;i<n;i++)
         {
             if(a[i]==0)
             {
                 max=1;
                 min=1;
                
             }
             long temp1=a[i]*max;
             long temp2=a[i]*min;
             max=Math.max(temp1,temp2);
             max=Math.max(a[i],max);
               min=Math.min(temp1,temp2);
             min=Math.min(a[i],min);
             res=Math.max(res,max);
         }
        System.out.println(res);
        sc.close();
    }
}
