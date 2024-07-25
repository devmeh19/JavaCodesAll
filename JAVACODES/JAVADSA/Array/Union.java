package JAVACODES.JAVADSA.Array;
import java.util.*;
public class Union
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
        int arr[]=new int[n+m];
        int p=0;
    int i=0;
    int j=0;
    int vis[]=new int[100000];
    while(i<n&&j<m)
    {
        if(a[i]<=b[j])
        {
            if(vis[a[i]]!=1||arr.length==0)
            {
            arr[p]=a[i];
            p++;
            vis[a[i]]=1;
        }
          i++;
        }
        else
        {
            if(vis[b[j]]!=1||arr.length==0)
            {
            arr[p]=b[j];
       
            p++;
            vis[b[j]]=1;
        }
             j++;
        }
    }
    while(j<m)
    {
      
                 if(vis[b[j]]!=1||arr.length==0)
            {
            arr[p]=b[j];
       
            p++;
            vis[b[j]]=1;
        }
             j++;  
    }
    while(i<n)
    {
            if(vis[a[i]]!=1||arr.length==0)
            {
            arr[p]=a[i];
            p++;
            vis[a[i]]=1;
        }
          i++;    
    }     


             for(int i1=0;i1<p;i1++)
        {
            System.out.println(arr[i1]);
        }
        sc.close();
    }
}
