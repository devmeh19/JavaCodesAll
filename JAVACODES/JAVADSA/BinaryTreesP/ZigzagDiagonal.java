package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ZigzagDiagonal {
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
 zigzag(root);
System.out.println();
diagonal(root);
sc.close();
}
static void level(Node root,int n)
    {
        if(root==null)
        return;
         if(n==1)
  System.out.print(root.data+" ");
   level(root.left,n-1);
   level(root.right,n-1);
    }
    static void level1(Node root,int n)
    {
        if(root==null)
        return;
         if(n==1)
   System.out.print(root.data+" ");
   level1(root.right,n-1);
   level1(root.left,n-1);
    }
static int height(Node root)
{
    if(root==null||root.left==null&&root.right==null)
    {
        return 0;
    }
    return 1+Math.max(height(root.left),height(root.right));
}
static void zigzag(Node root)
{
  int level2=height(root)+1;
  for(int i=1;i<=level2;i++)
  {
      if(i%2!=0)
      level(root,i);
      else
      level1(root,i);
  }
}
  static void diagonal(Node root)
           {
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(q.size()>0)
            {
                Node t=q.remove();
                while(t!=null)
                {
                    if(t.left!=null)
                    q.add(t.left);
                    System.out.println(t.data);
                    t=t.right;
                }
            }
           }
}
