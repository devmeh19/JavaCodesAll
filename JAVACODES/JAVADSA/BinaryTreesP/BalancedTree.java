package JAVACODES.JAVADSA.BinaryTreesP;

import java.util.Scanner;

public class BalancedTree {
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
  
System.out.println(isBalanced(root));
sc.close();
}
static int height(Node root)
{
if(root==null||(root.left==null&&root.right==null))
{
    return 0;
}

return 1+(Math.max(height(root.left),height(root.right)));
}
static boolean isBalanced(Node root)
{
if(root==null)
return true;
int lh=height(root.left);
if(root.left!=null)
lh++;
int rh=height(root.right);
if(root.right!=null)
rh++;
int d=lh-rh;
if(d<0)
d=-d;
if(d>1)
return false;
return isBalanced(root.left) && isBalanced(root.right);



}
}