package JAVACODES.JAVADSA.Array;
import java.util.*;
public class CountPairSum {
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
        HashMap<Integer,Integer> f=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            f.put(arr[i],f.getOrDefault(arr[i],0)+1);
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>k)
            {
                continue;
            }
            int se=k-arr[i];
            if(f.getOrDefault(se,0)>0){
            res+=f.get(se);
            f.put(arr[i],f.get(arr[i])-1);
            if(arr[i]==se)
            res-=1;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
