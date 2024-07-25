import java.util.*;
public class MInRope {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter total length");
        int n=sc.nextInt();
        long arr[]=new long[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        long cost=0;
        while(pq.size()>1)
        {
            long a=pq.remove();
            long b=pq.remove();
            long c=a+b;
            cost+=c;
            pq.add(c);
        }
      System.out.println(cost);

        sc.close();
    }
}
