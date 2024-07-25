package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class KthAncestor {
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
      //      Scanner sc=new Scanner(System.in);
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
System.out.println(kthAncestor(root,1,4));
sc.close();
}
static int o;
static Node solve(Node root,int node) 
{
    if(root==null)
    return null;
    if(root.data==node)
    return root;
    Node l=solve(root.left,node);
    Node r=solve(root.right,node);
    if(l!=null&&r==null)
    {
        o--;
        if(o<=0)
        {
            o=Integer.MAX_VALUE;
            return root;
        }
        return l;
    }
     if(l==null&&r!=null)
    {
        o--;
        if(o<=0)
        {
            o=Integer.MAX_VALUE;
            return root;
        }
        return r;
    }
    return null;
    
    
}
static public int kthAncestor(Node root, int k, int node)
{
 o=k;
Node pp=solve(root,node);
if(pp==null ||pp.data==node)
return -1;
else
return pp.data;
}
}
