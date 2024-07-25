package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class diameter1 {
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
    static int diameter(Node root)
{
    if(root==null||root.left==null&&root.right==null)
    return 0;
    int lans=diameter(root.left);
    int rans=diameter(root.right);
    int mid=height(root.left)+height(root.right);
    if(root.left!=null)
    mid++;
    if(root.right!=null)
    mid++;
    int max=Math.max(lans,Math.max(rans,mid));
    return max;
}

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    Node root=create();
 System.out.println(diameter(root));
sc.close();
}
}
