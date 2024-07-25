package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MedianDifferentSize {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the first array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter size of Second Array");
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        if(a.length>b.length)
        {
            int aa[]=b;
            b=a;
            a=aa;
            int g=n;
            n=m;
            m=g;
        }
        int k=(n+m+1)/2;
        int left=k;
        int low=Math.max(0,k-m);
        int high=Math.min(n,k);
        while(low<=high)
        {
            int mid=(low+high)/2;
            int mid2=left-mid;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;
            
            if(mid<n)
            r1=a[mid];
            if(mid2<m)
            {
                r2=b[mid2];
            }
            if(mid-1>=0)
            l1=a[mid-1];
            if(mid2-1>=0)
            {
                l2=b[mid2-1];
            }
            if(l1<=r2&&l2<=r1)
            {
                  System.out.println(Math.max(l1,l2));
                return;
        }
        if(l1>r2)
        {
            high=mid-1;
        }
        if(l2>r1)
        {
            low=mid+1;
        }
            
        }
      System.out.println(0);


    }
}
