package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class ReverseStackR 
{
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
    static void reverse(Stack<Integer> s)
     {
        if(s.size()==0)
        return;
       int m=s.pop();
        reverse(s);
        solve(s,s.size(),m,0);


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
         System.out.println(s);
      reverse(s);
             System.out.println(s);
         sc.close();
     }
    
}
