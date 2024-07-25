package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class MiddleElementStack 
{
static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
{
    Stack<Integer> s=new Stack<>();
      Stack<Integer> s1=new Stack<>();
    System.out.println("Enter size");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        System.out.println("Enter data");
        s.push(sc.nextInt());
    }
    int m=n/2;
    for(int i=1;i<=m;i++)
    {
s1.push(s.pop());
    }
    int mid=s.pop();
    while(!s1.isEmpty())
    {
        s.push(s1.pop());
    }
    System.out.println(mid);
    System.out.println(s);
sc.close();
}
}
