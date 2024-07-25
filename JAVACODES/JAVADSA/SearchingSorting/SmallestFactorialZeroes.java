package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class SmallestFactorialZeroes {
     
    static int zero(int x)
    {
        int de=5;
        int zs=0;
        while(x>=de)
        {
            zs+=x/de;
            de=de*5;
        }
        return zs;
    }
    
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int start=0;
        int end=5*n;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end)
        {
            if(zero(mid)>=n)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
                
            }
            mid=start+(end-start)/2;
        }
   System.out.println(ans);
        



        sc.close();
    }
}
