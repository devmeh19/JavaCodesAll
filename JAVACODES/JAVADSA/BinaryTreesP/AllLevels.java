package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AllLevels {
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
        static Scanner sc=new Scanner(System.in);
    public static  Node create()
    {
          
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
public static void main(String args[])
{
Node root=create();
  level(root);
  reverselevel(root);
  level2(root,2);
System.out.println();
sc.close();

}static void level(Node root)
{
    //Node t=root;
    Queue<Node> q =new LinkedList<>();
    if(root!=null)
    {
        q.add(root);
        while(q.size()>0)
        {
            Node temp=q.peek();
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
            System.out.print(temp.data+" ");
            q.remove();
        }
    }
    
}
static void reverselevel(Node root)
{
    Queue<Node> q =new LinkedList<>();
    Stack<Node> s=new Stack<>();
     q.add(root);
    if(root!=null)
    {
        while(q.size()>0)
        {
            Node temp=q.peek();
             s.push(temp);
               q.remove();
            if(temp.right!=null)
            q.add(temp.right);
             if(temp.left!=null)
            q.add(temp.left);
            //System.out.println(temp.data+" ");
        }
    }
    while(s.size()>0)
    {
       // Node t=s.peek();
       System.out.print((s.pop().data));
    }
}

static void level2(Node root,int n)
{
    if (root==null)
    return ;
    if(n==1)
    System.out.print(root.data+" ");
    level2(root.left,n-1);
    level2(root.right,n-1);
}




    
}
