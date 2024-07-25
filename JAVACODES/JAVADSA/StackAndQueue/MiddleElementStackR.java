package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class MiddleElementStackR {
    static Scanner sc=new Scanner(System.in);
    static void solve(Stack<Integer> s,int size,int count)
    {
        if(count==size/2)
        {
            s.pop();
            return;
        }
        int m=s.pop();
        solve(s,size,count+1);
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
      int size=s.size();
      solve(s,size,0);
      System.out.println(s);
        sc.close();
    }
    
}
