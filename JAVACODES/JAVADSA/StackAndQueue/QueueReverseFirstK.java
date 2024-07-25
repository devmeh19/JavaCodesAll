package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class QueueReverseFirstK {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            q.add(sc.nextInt());
        }
        System.out.println("Enter Index");
        int k=sc.nextInt();
        int mm=0;
        System.out.println(q);
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()&&mm!=k)
        {
s.push(q.remove());
mm++;
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        for(int i=0;i<n-k;i++)
        q.add(q.remove());
        System.out.println(q);
        sc.close();
    }
}
