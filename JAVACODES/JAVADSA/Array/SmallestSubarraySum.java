package JAVACODES.JAVADSA.Array;
import java.util.*;
public class SmallestSubarraySum {
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
        System.out.println("Enter sum");
        int x=sc.nextInt();
        int wstart=0;
        int wend=0;
        int sum=0;
        int len=0;
        int minlen=Integer.MAX_VALUE;
        while(wend<n)
        {
            sum=sum+a[wend];
            if(sum>x)
            {
              len=wend-wstart+1;
              minlen=Math.min(len,minlen);
              while(wstart<wend&&sum>x)
                {
                    sum=sum-a[wstart];
                      wstart++;
                    if(sum>x)
                    {
                         len=wend-wstart+1;
                         minlen=Math.min(len,minlen);
                         
                    }
                }
                
                
            }
            wend++;
        }
        System.out.println(minlen==Integer.MAX_VALUE?0:minlen);
        
        sc.close();
    }

    
}
