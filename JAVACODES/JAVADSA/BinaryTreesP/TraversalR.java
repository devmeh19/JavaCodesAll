package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class TraversalR {
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
    inorder(root);
    System.out.println();
    preorder(root);
      System.out.println();
    postorder(root);
      System.out.println();
   sc.close();
}
static void inorder(Node root)
{
if(root==null)
return ;
inorder(root.left);
System.out.print(root.data);
inorder(root.right);
}
 static void preorder(Node root)
{
if(root==null)
return ;
System.out.print(root.data);
preorder(root.left);
preorder(root.right);
}
 static void postorder(Node root)
{
if(root==null)
return ;
postorder(root.left);
postorder(root.right);
System.out.print(root.data);
}
}
