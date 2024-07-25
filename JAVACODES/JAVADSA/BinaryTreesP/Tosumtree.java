package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class Tosumtree {
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
System.out.println(tosumtree(root));
sc.close();
}
public static  int tosumtree(Node root)
{
    if(root==null)
    return 0;
    int left1=tosumtree(root.left);
    int right1=tosumtree(root.right);
    int val=root.data+left1+right1;
    root.data=left1+right1;
    return val;
}
}
