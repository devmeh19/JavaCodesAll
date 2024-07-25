package JAVACODES.JAVADSA.StackAndQueue;

import java.util.*;

public class StackUsingQueuePop {
    static Scanner sc=new Scanner(System.in);
    Queue<Integer> q1=new LinkedList<>();
     Queue<Integer> q2=new LinkedList<>();
   void push(int d)
   {
       q2.add(d);
       while(!q1.isEmpty())
       {
        q2.add(q1.remove());
       }
       while(!q2.isEmpty())
       {
q1.add(q2.remove());

       }
   }
   int pop()
   {
int m=q1.remove();
return m;
   }
   void display()
   {
       System.out.println(q1);

   }
   public static void main(String[] args) {
      StackUsingQueuePop ob =new StackUsingQueuePop();
      ob.push(1);
ob.push(2);
ob.push(3);
ob.push(4);
ob.push(5);
ob.display();
System.out.println(ob.pop());
ob.display();
       sc.close();
   }
}
