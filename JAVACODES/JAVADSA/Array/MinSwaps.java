package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MinSwaps
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
        System.out.println("Enter k");
        int k=sc.nextInt();
        int fav=0;
        int nfav=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=k)
            fav++;
        }
        for(int i=0;i<fav;i++)
        {
            if(a[i]>k)
            nfav++;
        }
        int l=0;
        int r=fav-1;
        int res=Integer.MAX_VALUE;
        while(r<n)
        {
            res=Math.min(res,nfav);
            r++;
            if(r<n&&a[r]>k)
            {
                nfav++;
            }
               if(r<n&&a[l]>k)
            {
                nfav--;
            }
            l++;
        }
        System.out.println(res);
        
        sc.close(); 
}
 }
