package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class QueueReverseR {
    static Scanner sc=new Scanner(System.in);
    static void solve(Queue<Integer> q)
    {
        if(q.size()==0)
        return;
        int m=q.remove();
        solve(q);
        q.add(m);
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            q.add(sc.nextInt());
        }
        System.out.println(q);
    solve(q);
         System.out.println(q);
        sc.close();
    }
    
}
