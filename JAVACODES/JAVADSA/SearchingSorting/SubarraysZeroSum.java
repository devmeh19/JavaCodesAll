package JAVACODES.JAVADSA.SearchingSorting;
import java.util.*;
public class SubarraysZeroSum 
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
   
        int k=0;
        Map<Integer,Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;
        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - k;
            cnt = cnt+mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        System.out.println(cnt);



    }
}
