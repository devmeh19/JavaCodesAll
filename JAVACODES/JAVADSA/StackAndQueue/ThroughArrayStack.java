package JAVACODES.JAVADSA.StackAndQueue;

import java.util.Scanner;

public class ThroughArrayStack {
    int a[];
    int size;
    int top;
      static Scanner sc=new Scanner(System.in);
    ThroughArrayStack(int n)
    {
        size=n;
        a=new int[size];
        top=-1;
    }
    void push(int data)
    {
if(top==size-1)
{
    System.out.println("OverFlow Condition");
    return ;
}
a[++top]=data;
    }
int pop()
{
    if(top==-1)
    {
        System.out.println("UnderFlow Condition");
        return -1;
    }
    int m=a[top--];
    return m;
}
int peek()
{
     if(top==-1)
    {
        System.out.println("UnderFlow Condition");
        return -1;
    }
    int m=a[top];
    return m;
}
boolean isEmpty()
{
    if(top==-1)
    return true;
    return false;
}
boolean isFull()
{
    if(top==size-1)
    return true;
    return false;
}
int size()
{
    return top+1;
}
    public static void main(String[] args) {
        System.out.println("Enter size");
        int n=sc.nextInt();
      ThroughArrayStack ob=new ThroughArrayStack(n);
     System.out.println("Enter \n 1 for Insertion n 2 for Deletion \n 3 for Viewing\n -1 to quit it ");
     int va=sc.nextInt();
     while(va!=-1)
     {
        if(va==1)
        {
            System.out.println("Enter data");
            int d=sc.nextInt();
            ob.push(d);
        }
        if(va==2)
      {
        System.out.println(ob.pop());
      }
       if(va==3)
      {
        System.out.println(ob.peek());
      }
      va=sc.nextInt();
     }
    }
    
}
