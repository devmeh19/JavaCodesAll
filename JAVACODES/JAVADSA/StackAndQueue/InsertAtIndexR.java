package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class InsertAtIndexR {
    static Scanner sc=new Scanner(System.in);
   static void solve(Stack<Integer> s,int in,int d,int count)
    {
        if(count==in)
        {
            s.push(d);
            return;
        }
        int m=s.pop();
      solve(s,in,d,count+1);
      s.push(m);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
      System.out.println("Enter size");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          System.out.println("Enter data");
          s.push(sc.nextInt());
      }
   //   int size=s.size();
      System.out.println("Enter data and index to be inserted");
        int d=sc.nextInt();
      int in=sc.nextInt();
      solve(s,in,d,0);
      System.out.println(s);
        sc.close();
    }
    
}
