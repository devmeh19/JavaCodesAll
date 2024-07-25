package JAVACODES.JAVADSA.Array;
import java.util.*;
public class MinimiseHeights 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        for(int i=0;i<n-1;i++)
        {
            int max=Math.max(largest,arr[i]+k) ;
            int min=Math.min(smallest,arr[i+1]-k);
            if(min<0)
            continue;
            ans=Math.min(ans,max-min);
        }
        System.out.println(ans);
        sc.close();
    }
}
