package JAVACODES.JAVADSA.StackAndQueue;

import java.util.Scanner;

public class CircularQueueLinkedList 
{
     Node front;
    Node rear;
  int size;
    class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
   public CircularQueueLinkedList ()
    {
        front=null;
        rear=null;
        size=0;
    }
    void push(int dd)
    {
    Node temp=new Node(dd);
        size++;
   if(front==null&&rear==null)
   {
front=temp;
rear=temp;
rear.next=front;
return;
   }
   rear.next=temp;
   rear=temp;
   rear.next=front;
    }
    int pop()
    {
        if(front==null&&rear==null)
        {
            System.out.println("UnderFlow Condition");
            return -1;
        }
           size--;
      if(front==rear)
      {
        int mm=front.data;
        front=null;
        rear=null;
return mm;
      }
      int m=front.data;
      front=front.next;
      rear.next=front;
        return m;
    }
     int peek()
    {
        if(front==null&&rear==null)
        {
            System.out.println("UnderFlow Condition");
            return -1;
        }
        return front.data;
    }
    boolean isEmpty()
    {
        if(front==null&&rear==null)
        return true;
        return false;
    }
    int size()
    {
        return size;
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
      CircularQueueLinkedList  ob =new CircularQueueLinkedList ();
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
        sc.close();
       }
    
}
