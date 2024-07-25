package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class BookAllocation {
    static boolean isPossible(int a[],int m,int n,int mid)
    {
        int sc=1;
        int ps=0;
        for(int i=0;i<n;i++)
        {
            if(ps+a[i]<=mid)
            {
                ps+=a[i];
            }
            else
            {
                sc++;
                if(sc>m||a[i]>mid)
                {
                    return false;
                }
                ps=a[i];
            }
        }
        return true;
    }
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
        int start=0;
        int sum=0;
        System.out.println("Enter No. of Books");
        int M=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        int end=sum;
        int mid=start+(end-start)/2;
        int ans=-1;
        if(M>n){
      System.out.println(ans);
            return ;

        }
        while(start<=end)
        {
            if(isPossible(a,M,n,mid))
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


}
}
