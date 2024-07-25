package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class QueueReversal {
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
        System.out.println(q);
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty())
        {
s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        System.out.println(q);
        sc.close();
    }
}
