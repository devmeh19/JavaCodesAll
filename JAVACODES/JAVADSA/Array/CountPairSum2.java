package JAVACODES.JAVADSA.Array;
import java.util.*;
public class CountPairSum2 
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
        Arrays.sort(a);
        int i=0;
        int j=n-1;
        int sum=0;
        int res=0;
        int f=0;
        int f1=0;
        while(i<j)
        {
            f=0;
            f1=0;
            sum=a[i]+a[j];
            if(sum==k)
            {
                res++;
                if(a[i]==a[i+1])
                {
                    f=1;
                 i++;
                }
                  if(a[j]==a[j-1])
                {
                    f1=1;
                  j--;
                }
                if(f==0&&f1==0)
                {
                    i++;
                    j--;
                }
            }
            else if(sum<k)
            {
                i++;
            }
            else if(sum>k)
            {
                j--;
            }
            
        }
       System.out.println(res);
        sc.close();
    }
}
