package JAVACODES.JAVADSA.Heap;
import java.util.*;
public class PriotityQueueKthSmallest {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
      int arr[]={5,6,10,9,1,7,4};
      System.out.println("Enter K");
      int k=sc.nextInt();
      for(int i=0;i<arr.length;i++)
      {
         if(pq.size()==k)
         {
            if(pq.peek()>arr[i])
            {
               pq.remove();
               pq.add(arr[i]);
            }
         }
         else
         {
            pq.add(arr[i]);
         }
      }
   System.out.println(pq.peek());
       sc.close();
    } 
    
}
