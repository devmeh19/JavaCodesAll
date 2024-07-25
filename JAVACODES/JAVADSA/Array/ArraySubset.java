package JAVACODES.JAVADSA.Array;
import java.util.*;
public class ArraySubset 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of two array");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long vis[]=new long[1000000];
        
        int i=0;
        int j=0;
        int p=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j])
            {
                i++;
            }
            else if(a[i]>b[j])
            {
                j++;
            }
            else
            {
        if(vis[j]==0) {
                p++;
                vis[j]=1;
        }
          i++;
                j++;
            }
        }
        if(p==b.length){
            System.out.println("Yes");
        return ;
        }
        System.out.println("No");
        sc.close();
    }
}
