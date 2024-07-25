package JAVACODES.JAVADSA.Array;
import java.util.*;
public class LRU {
    static Scanner sc=new Scanner(System.in);  
      public static void main(String[] args) {
        System.out.println("Enter No. of pages");
        int N=sc.nextInt();
        int pages[]=new int[N];
        System.out.println("Enter Memory");
        int C=sc.nextInt();
        System.out.println("Enter Pages");
        for(int i=0;i<N;i++)
        {
            pages[i]=sc.nextInt();
        }
        Queue<Integer> q=new LinkedList<>();
        int count=0;
        for(int i=0;i<N;i++)
        {
            if(!q.contains(pages[i]))
            {
                q.add(pages[i]);
                count++;
                if(q.size()>C)
                {
                    q.remove();
                }
            }
            else
            {
               q.remove(pages[i]);
               q.add(pages[i]);
            }
        }
        
       System.out.println(count);

        sc.close();
    }
}
