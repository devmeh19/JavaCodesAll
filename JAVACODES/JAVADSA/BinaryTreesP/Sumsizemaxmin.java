package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class Sumsizemaxmin {
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
        //    Scanner sc=new Scanner(System.in);
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
    static int size(Node root)
{
    if(root==null)
    {
        return 0;
    }
    return size(root.left)+size(root.right)+1;

}
static int sum(Node root)
{
    if(root==null)
    {
        return 0;
    }
    return sum(root.left)+sum(root.right)+root.data;

}
static Scanner sc=new Scanner(System.in);
static int max(Node root)
{
    if(root==null)
    {
        return Integer.MIN_VALUE;
    }
    return Math.max(root.data,Math.max(max(root.left),max(root.right)));
}
    static int min(Node root)
{
    if(root==null)
    {
        return Integer.MAX_VALUE;
    }
    return Math.min(root.data,Math.min(min(root.left),min(root.right)));

}
    public static void main(String args[])
    {
    Node root=create();
 System.out.println(sum(root));
 System.out.println(size(root));
 System.out.println(min(root));
 System.out.println(max(root));
   sc.close();
}
}
