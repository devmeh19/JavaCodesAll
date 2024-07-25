package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeftRightViewLevels {
 
      static class Node
    {
        Node left;
        Node right;
        int data;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static  Node create()
    {
           // Scanner sc=new Scanner(System.in);
        Node root=null; 
        System.out.println("Enter data");
        int data=sc.nextInt();
        if(data==-1)
        {
            
            return null;
        }
root=new Node(data);
System.out.println("Enter left for"+data);
root.left=create();
System.out.println("Enter right for"+data);
root.right=create();

return root;
}
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
{
Node root=create();
level4(root);
leftview(root);
rightview(root);
System.out.println();
sc.close();
}
  static void  level4(Node root)
    {
Queue<Node> q=new LinkedList<>();
q.add(root);
if(root==null)
{
    return;
}
while(q.size()>0){
    int sz=q.size();
    while(sz!=0)
    {
        Node t=q.peek();
        System.out.print(t.data+" ");
        if(t.left!=null)
q.add(t.left);
if(t.right!=null)
{
    q.add(t.right);
}
q.remove();
sz--;
    }
}
    }
    static void leftview(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        if(root!=null)
        {
        while(q.size()>0){
            int sz=q.size();
            System.out.println(q.peek().data);
            while(sz!=0)
            {
                Node t=q.peek();
                if(t.left!=null)
        q.add(t.left);
        if(t.right!=null)
        {
            q.add(t.right);
        }
        q.remove();
        sz--;
            }   
        }
        }
        
            }
            static void rightview(Node root)
            {
                Queue<Node> q=new LinkedList<>();
              //  ArrayList<Integer> list=new ArrayList<>();
             q.add(root);
        if(root!=null)
        {
        while(q.size()>0){
            int sz=q.size();
         System.out.println(q.peek().data);
            while(sz!=0)
            {
                Node t=q.peek();
               
        if(t.right!=null)
        {
            q.add(t.right);
        }
         if(t.left!=null)
        q.add(t.left);
        q.remove();
        sz--;
            }   
        }
        }  
            }
}
