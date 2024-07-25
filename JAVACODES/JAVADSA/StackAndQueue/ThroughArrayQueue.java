package JAVACODES.JAVADSA.StackAndQueue;

import java.util.Scanner;

public class ThroughArrayQueue 
{  
    int a[];
    int size;
    int front;
    int rear;
    static Scanner sc=new Scanner(System.in);
    ThroughArrayQueue(int n)
    {
        size=n;
        a=new int[size];
        front=-1;
        rear=-1;
    }
    void push(int data)
    {
if(rear==size-1)
{
    System.out.println("OverFlow Condition");
    return ;
}
if(front==-1&&rear==-1)
{
    front++;
    rear++;
    a[front]=data;
    return;
}
a[++rear]=data;
    }
int pop()
{
    if(front==-1&&rear==-1)
    {
        System.out.println("UnderFlow Condition");
        return -1;
    }
    if(front==rear)
    {
        int m1=a[front];
        front =-1;
        rear=-1;
        return m1;
    }
    int m=a[front++];
    return m;
}
int peek()
{
    if(front==-1&&rear==-1)
    {
        System.out.println("UnderFlow Condition");
        return -1;
    }
    int m=a[front];
    return m;
}
boolean isEmpty()
{
    if(front==-1&&rear==-1)
    return true;
    return false;
}
boolean isFull()
{
    if(rear==size-1)
    return true;
    return false;
}
int size()
{
    return (rear-front)+1;
}
    public static void main(String[] args) {
        System.out.println("Enter size");
        int n=sc.nextInt();
      ThroughArrayQueue ob=new ThroughArrayQueue(n);
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
