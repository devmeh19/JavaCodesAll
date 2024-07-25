package JAVACODES.JAVADSA.BinaryTreesP;

//import java.util.ArrayList;
import java.util.Scanner;

public class BoundaryTraversal {
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
   static  Scanner sc=new Scanner(System.in);
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
public static void main(String args[])
{
Node root=create();
boundary(root);
System.out.println();

}
  static   void left(Node root)
    {
        if(root==null)
        return;
        if(root.left!=null)
        {
            System.out.println(root.data);
            left(root.left);
        }
     else  if(root.right!=null)
        {
            System.out.println(root.data);
            left(root.right);
        }
    }
  static  void bottom(Node root)
    {
        if(root==null)
            return;
        bottom(root.left);
     if(root.left==null&&root.right==null)
       System.out.println(root.data);
        bottom(root.right);
    }
   static void right(Node root)
    {
        if(root==null)
        return;
        if(root.right!=null)
        {
            right(root.right);
           System.out.println(root.data);
        }
     else if(root.left!=null)
        {
            right(root.left);
           System.out.println(root.data);
        }
    }
	static void boundary(Node root)
	{
	   // ArrayList<Integer> list=new ArrayList<>();
	  System.out.println(root.data);
	    if(root.left==null&&root.right==null)
	    return;
	    left(root.left);
	   bottom(root);
	   // bottom(root.right,list);
	  right(root.right);
      sc.close();
	}
}
