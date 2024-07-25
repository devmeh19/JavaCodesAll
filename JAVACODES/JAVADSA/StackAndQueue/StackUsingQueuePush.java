package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class StackUsingQueuePush {
    static Scanner sc=new Scanner(System.in);
     Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
    void push(int d)
    {
        q1.add(d);
    }
    int pop()
    {
while(q1.size()!=1)
{
q2.add(q1.remove());
}
int m=q1.remove();
while(!q2.isEmpty()){
    q1.add(q2.remove());
}
return m;
    }
    void display()
    {
        System.out.println(q1);

    }
    public static void main(String[] args) {
       StackUsingQueuePush ob =new StackUsingQueuePush();
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
