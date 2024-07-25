package JAVACODES.JAVADSA.StackAndQueue;

import java.util.Scanner;

public class CircularQueueArray 
{  
     int a[];
    int size;
    int front;
    int rear;
    static Scanner sc=new Scanner(System.in);
    CircularQueueArray(int n)
    {
        size=n;
        a=new int[size];
        front=-1;
        rear=-1;
    }
    void push(int data)
    {
if((rear+1)%size==front)
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
rear=(rear+1)%size;
a[rear]=data;
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
    int m=a[front];
    front=(front+1)%size;
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
    if((rear+1)%size==front)
    return true;
    return false;
}
int size()
{
    return size;
}
    public static void main(String[] args) {
        System.out.println("Enter size");
        int n=sc.nextInt();
    CircularQueueArray ob=new CircularQueueArray(n);
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
