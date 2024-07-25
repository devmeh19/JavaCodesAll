package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class QueueUsingStackPush {
static Scanner sc=new Scanner(System.in);
Stack<Integer> s1=new Stack<>();
Stack<Integer> s2=new Stack<>();
void push1(int d)
{
s1.push(d);
}
int pop1()
{
while(s1.size()!=1)
{
    s2.push(s1.pop());
}
int m=s1.pop();
while(!s2.isEmpty())
{
    s1.push(s2.pop());
}
return m;
}
void display()
{
    System.out.println(s1);
}
    public static void main(String[] args) {
        QueueUsingStackPush ob=new QueueUsingStackPush();
        ob.push1(1);
         ob.push1(2);
          ob.push1(3);
           ob.push1(4);
            ob.push1(5);
            ob.display();
            System.out.println(ob.pop1());
            ob.display();
    }
}
