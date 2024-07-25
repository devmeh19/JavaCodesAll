package JAVACODES.JAVADSA.StackAndQueue;

import java.util.*;
public class SortStack {
    static Scanner sc=new Scanner(System.in);
    static void insertsort(Stack<Integer>s1 ,int m)
    {
     if(s1.size()==0||(s1.peek()<m))
     {
        s1.push(m);
        return;
     }
     int m1=s1.pop();
     insertsort(s1,m);
     s1.push(m1);
    }
    static void sort(Stack<Integer>s)
    {
        if(s.size()==0)
        return;
        int m=s.pop();
        sort(s);
        insertsort(s,m);

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
      System.out.println(s);
      sort(s);
      System.out.println(s);
      sc.close();
    }
    
}
