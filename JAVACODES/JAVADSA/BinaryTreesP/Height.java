package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class Height {
    
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
    static int height(Node root)
{
    if(root==null||root.left==null&&root.right==null)
    {
        return 0;
    }
    return 1+Math.max(height(root.left),height(root.right));
}
    public static void main(String args[])
    {
    Node root=create();
 int H=height(root);
 System.out.println(H);
 sc.close();
}
}
