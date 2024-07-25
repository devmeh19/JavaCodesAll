package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class SameTree {
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
    static boolean isSame(Node a,Node b)
    {
        if(a==null&&b==null)
        return true;
        if(a==null)
        return false;
        if(b==null)
        return false;
        if(a.data!=b.data)
        return false;
        return isSame(a.left,b.left)&&isSame(a.right,b.right);

    }
    public static void main(String args[])
    {
    Node root1=create();
       Node root2=create();
 System.out.println(isSame(root1,root2));
sc.close();
}
}
