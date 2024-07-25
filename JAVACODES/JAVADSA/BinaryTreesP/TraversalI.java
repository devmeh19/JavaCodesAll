package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;
import java.util.Stack;

public class TraversalI {
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
          //  Scanner sc=new Scanner(System.in);
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
  inorderi(root);
    System.out.println();
   preorderi(root);
      System.out.println();
    postorderi(root);
      System.out.println();
   sc.close();
}
 static void preorderi(Node root)
    {
        if(root==null)
            return;
        Stack<Node> s=new Stack<>();
        s.push(root);
        while(s.size()>0)
        {
            Node t=s.pop();
          System.out.println(t.data);
          if(t.right!=null)
          {
            s.push(t.right);
          }
          if(t.left!=null)
          {
          s.push(t.left);
        }
        }
    }
   static void inorderi(Node root)
    {
        if(root==null)
        return;
        Stack<Node> s1 = new Stack<>();
        s1.push(root);
        Node cu=root;
        while(s1.size()>0||cu!=null)
        {
     if(cu!=null)
     {
s1.push(cu);
    cu=cu.left;   
}
else{
cu=s1.pop();
System.out.println(cu.data);
cu=cu.right;
}
        }
    }
  static  void postorderi(Node root)
    {

        if(root==null)
            return;
        Stack<Node> s=new Stack<>();
        Stack<Integer> s1=new Stack<>();

        s.push(root);
        while(s.size()>0)
        {
            Node t=s.pop();
            s1.push(t.data);
          System.out.println(t.data);
          if(t.left!=null)
          {
            s.push(t.left);
          }
          if(t.right!=null)
          {
          s.push(t.right);
        }
        }
        while(s1.size()>0)
        {
            System.out.println(s1.pop());
        }
    }
}
