package JAVACODES.JAVADSA.Array;
import java.util.*;
public class Intersection 
{
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
        System.out.println("Enter size of the second array");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Enter Elements");
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int vis[]=new int[1000000];
        int arr[]=new int[n+m];
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
        if(vis[a[i]]==0) {
            arr[p]=a[i];
                p++;
                vis[a[i]]=1;
        }
          i++;
                j++;
            }
        }
        for(int i1=0;i1<p;i1++)
        {
            System.out.println(arr[i1]);
        } 
    }   
}
