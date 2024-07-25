package JAVACODES.JAVADSA.StackAndQueue;
import java.util.*;
public class ThroughLinkedListStack {
  Node head;
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
   public ThroughLinkedListStack()
    {
        head=null;
        size=0;
    }
    void push(int dd)
    {
    Node temp=new Node(dd);
    temp.next=head;
    head=temp;
    size++;
    }
    int pop()
    {
        if(head==null)
        {
            System.out.println("UnderFlow Condition");
            return -1;
        }
          size--;
        int m=head.data;
        head=head.next;
        return m;
    }
     int peek()
    {
        if(head==null)
        {
            System.out.println("UnderFlow Condition");
            return -1;
        }
        int m=head.data;
        return m;
    }
    boolean isEmpty()
    {
        if(head==null)
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
        ThroughLinkedListStack ob =new ThroughLinkedListStack();
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
