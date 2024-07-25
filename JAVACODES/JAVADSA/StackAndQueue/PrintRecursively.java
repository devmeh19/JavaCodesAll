package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class PrintRecursively {
    static Scanner sc=new Scanner(System.in);
    static void printreverse(Stack<Integer> s)
    {
        if(s.size()==0)
        return;
        int m=s.pop(); 
        System.out.println(m);
        printreverse(s);
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
      System.out.println(s);
      printreverse(s);
      System.out.println(s);
        sc.close();
    }
    
}
